package com.centralbank.app.service;

import com.centralbank.app.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centralbank.app.model.Loan;

@Service
public class LoanServiceImpl implements LoanService {
	
	@Autowired
    LoanRepository loanRepository;

	@Override
	public Loan getLoanById(long Id) {
		// TODO Auto-generated method stub
		return loanRepository.findOne(Id);
	}

}
