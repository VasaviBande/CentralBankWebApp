package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Account;
import com.example.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accRepo;

	@Override
	public List<Account> getAcById(long id) {
		// TODO Auto-generated method stub
		return (List<Account>) accRepo.findAcById(id);
	}

}
