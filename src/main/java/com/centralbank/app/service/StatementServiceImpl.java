package com.centralbank.app.service;

import java.util.List;

import com.centralbank.app.repository.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centralbank.app.model.Statement;

@Service("statementService")
public class StatementServiceImpl implements StatementService {
	
	
	@Autowired
	private StatementRepository statementRepository;

	@Override
	public List<Statement> getAllStatements() {
		// TODO Auto-generated method stub
		return statementRepository.findAll();
	}

	@Override
	public Statement getStatementById(long id) {
		// TODO Auto-generated method stub
		return statementRepository.findOne(id);
	}
	
	

}
