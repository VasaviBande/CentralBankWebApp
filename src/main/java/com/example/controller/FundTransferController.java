package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Account;
import com.example.model.Beneficiary;
import com.example.model.User;
import com.example.service.AccountService;
import com.example.service.BeneficiaryService;
import com.example.service.UserService;

@Controller
public class FundTransferController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BeneficiaryService benService;
	
	@Autowired
	private AccountService accService;

	
	@RequestMapping(value="/admin/interTransfer", method = RequestMethod.GET)
    public List<Beneficiary> getAllBenById(Model model) {
		
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
        model.addAttribute("userName", user.getName() + " " + user.getLastName());
        List<Beneficiary> bens=benService.getBenById(user.getId());
        //List<Beneficiary> bens = (List<Beneficiary>) benService.getBenById(4);
        List<Account> acc = accService.getAcById(user.getId());
        model.addAttribute("acc", accService.getAcById(user.getId()));
       System.out.println("Size of acc:"+acc.size());
        model.addAttribute("bens", benService.getBenById(user.getId()));
        
        return bens;
    }
	
	
	/*@RequestMapping(value="/admin/interTransfer", method = RequestMethod.GET)
    public List<Account> getAcById(Model model) {
		
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
        model.addAttribute("userName", user.getName() + " " + user.getLastName());
        
        List<Account> accs = accService.getAcById(user.getId());
        model.addAttribute("acc", accService.getAcById(user.getId()));
        return accs;
    }*/
	
	
	/*@RequestMapping(value="/admin/interTransfer", method = RequestMethod.GET)
	public ModelAndView interTransfer(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName", user.getName() + " " + user.getLastName());
		modelAndView.addObject("adminMessage","to Central Bank Internet Banking Application");
		modelAndView.setViewName("admin/interTransfer");
		return modelAndView;
	}*/
}
