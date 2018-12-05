package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Loan;
import com.example.repository.LoanRepository;

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
