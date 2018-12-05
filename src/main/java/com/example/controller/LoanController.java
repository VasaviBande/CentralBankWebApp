package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Loan;
import com.example.model.User;
import com.example.service.LoanService;
import com.example.service.UserService;

@Controller
public class LoanController {
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private LoanService loanService;
	
	@RequestMapping(value="/admin/loanSummary", method = RequestMethod.GET)
	public ModelAndView loanSummary(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName", user.getName() + " " + user.getLastName());
		Loan loan = loanService.getLoanById(user.getId());
		modelAndView.addObject("loanDetails", loan);
		modelAndView.setViewName("admin/loanSummary");
		return modelAndView;
	}
	

}
