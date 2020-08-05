package com.centralbank.app.controller;

import com.centralbank.app.model.Account;
import com.centralbank.app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.centralbank.app.model.User;
import com.centralbank.app.service.UserService;


@Controller
public class AccountController {
	
	@Autowired
	private UserService userService;

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/admin/acSummary", method = RequestMethod.GET)
	public ModelAndView acSummary(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName", user.getName() + " " + user.getLastName());
		Account account = accountService.getAcById(user.getId());
		modelAndView.addObject("accNo", account.getAc_no());

		modelAndView.setViewName("admin/acSummary");
		return modelAndView;
	}

}
