
package com.centralbank.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.centralbank.app.model.Beneficiary;
import com.centralbank.app.model.User;
import com.centralbank.app.service.BeneficiaryService;
import com.centralbank.app.service.UserService;

@Controller
public class BeneficiaryController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BeneficiaryService benService;
	
	@RequestMapping(value="/admin/stat", method = RequestMethod.GET)
	public ModelAndView acStatement(){
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		Beneficiary benf = new Beneficiary();
		modelAndView.addObject("benf",benf);
		modelAndView.addObject("userName", user.getName() + " " + user.getLastName());
		modelAndView.setViewName("admin/addBen");
		return modelAndView;
	}
	
	@RequestMapping(value="/admin/addBen", method = RequestMethod.GET)
    public ModelAndView addBenefeciary(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
        Beneficiary benf = new Beneficiary();
        modelAndView.addObject("benf", benf);
        modelAndView.addObject("userName", user.getName() + " " + user.getLastName());
        modelAndView.addObject("custId", user.getId());
        modelAndView.setViewName("admin/addBen");
        return modelAndView;
	}
		
	@RequestMapping(value="/admin/addBen", method = RequestMethod.POST)
	public String addBen(@Valid Beneficiary benf, BindingResult result, Model model) {
		
		 if (result.hasErrors()) {
	            return "/admin/addBen";
	        }
		 else {  
		 	benService.createBeneficiary(benf);
	        return "redirect:/admin/viewBen";
		 }
	
	}
	
	@RequestMapping(value="/admin/viewBen", method = RequestMethod.GET)
    public List<Beneficiary> getAllBenById(Model model) {
		
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
        model.addAttribute("userName", user.getName() + " " + user.getLastName());
        List<Beneficiary> bens=benService.getBenById(user.getId());
        //List<Beneficiary> bens = (List<Beneficiary>) benService.getBenById(4);
        model.addAttribute("bens", benService.getBenById(user.getId()));
        return bens;
    }
	
	@RequestMapping(value="/admin/delBen/{id}")
	public String delBen(@PathVariable int id) {
		benService.delBenById(id);
		return "redirect:/admin/viewBen";
	}
	

}
