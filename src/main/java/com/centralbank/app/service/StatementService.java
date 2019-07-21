package com.centralbank.app.service;

import java.util.List;

import com.centralbank.app.model.Statement;

public interface StatementService {
	
	public List<Statement> getAllStatements();
	
	public Statement getStatementById(long id);

}
