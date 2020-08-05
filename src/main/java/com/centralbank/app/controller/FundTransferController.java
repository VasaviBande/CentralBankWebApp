package com.centralbank.app.controller;

import java.util.List;

import com.centralbank.app.exception.InsufficientAccountBalanceException;
import com.centralbank.app.model.Account;
import com.centralbank.app.model.BankingTransactions;
import com.centralbank.app.model.Beneficiary;
import com.centralbank.app.model.User;
import com.centralbank.app.service.AccountService;
import com.centralbank.app.service.BeneficiaryService;
import com.centralbank.app.service.TransactionService;
import com.centralbank.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FundTransferController {

    private UserService userService;
    private BeneficiaryService benService;
    private AccountService accService;
    private final TransactionService transactionService;

    @Autowired
    public FundTransferController(UserService userService, BeneficiaryService benService, AccountService accService, TransactionService transactionService) {
        this.userService = userService;
        this.benService = benService;
        this.accService = accService;
        this.transactionService = transactionService;
    }

    @RequestMapping(value = "/admin/interTransfer", method = RequestMethod.GET)
    public List<Beneficiary> getAllBenById(Model model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        model.addAttribute("userName", user.getName() + " " + user.getLastName());
        List<Beneficiary> bens = benService.getBenById(user.getId());
        //List<Beneficiary> bens = (List<Beneficiary>) benService.getBenById(4);
        Account acc = accService.getAcById(user.getId());
        model.addAttribute("acc", accService.getAcById(user.getId()));
        //System.out.println("Size of acc:"+acc.size());
        model.addAttribute("bens", benService.getBenById(user.getId()));

        return bens;
    }

    @RequestMapping(value = "/admin/interTransfer", method = RequestMethod.POST)
    public void fundTransferMethod() throws InsufficientAccountBalanceException {
        BankingTransactions fromAccount = new BankingTransactions();
        fromAccount.setCustomerId(4);

        BankingTransactions toAccount = new BankingTransactions();
        toAccount.setCustomerId(11);
        //transactionService.transferFund(fromAccount, toAccount, 1000.0);

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
