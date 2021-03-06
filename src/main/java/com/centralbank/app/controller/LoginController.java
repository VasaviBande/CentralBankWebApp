package com.centralbank.app.controller;

import javax.validation.Valid;

import com.centralbank.app.model.BankingTransactions;
import com.centralbank.app.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.centralbank.app.model.User;
import com.centralbank.app.service.StatementService;
import com.centralbank.app.service.UserService;

import com.centralbank.app.model.Statement;

import java.util.Date;


@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private StatementService statementService;

	@Autowired
	private TransactionService transactionService;

	@RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public ModelAndView registration(){
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			bindingResult
					.rejectValue("email", "error.user",
							"There is already a user registered with the email provided");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("registration");
		} else {
			userService.saveUser(user);
			modelAndView.addObject("successMessage", "User has been registered successfully");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("registration");
			
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/admin/home", method = RequestMethod.GET)
	public ModelAndView home(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName", user.getName() + " " + user.getLastName());
		modelAndView.addObject("adminMessage","To Central Bank Internet Banking System.");
		modelAndView.addObject("standardDate", new Date());
		modelAndView.setViewName("admin/home");
		return modelAndView;
	}
	
	@RequestMapping(value="/admin/finSummary", method = RequestMethod.GET)
	public ModelAndView finSummary(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName", user.getName() + " " + user.getLastName());
		BankingTransactions bankingTransactions = transactionService.getCurrentBalance(user.getId());
		modelAndView.addObject("curBal", bankingTransactions.getCurrentBal());
		modelAndView.setViewName("admin/finSummary");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/admin/statement", method = RequestMethod.GET)
	public ModelAndView acStatement(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		Statement stmt = statementService.getStatementById(user.getId());
		modelAndView.addObject("stmt",stmt);
		
		modelAndView.addObject("userName", user.getName() + " " + user.getLastName());
		modelAndView.setViewName("admin/statement");
		return modelAndView;
	}
	

	

}
