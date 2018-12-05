package com.example.service;

import java.util.List;

import com.example.model.Statement;

public interface StatementService {
	
	public List<Statement> getAllStatements();
	
	public Statement getStatementById(long id);

}
