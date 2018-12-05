package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Statement;
import com.example.service.StatementService;




@RestController
public class StatementRestController {

	@Autowired
	private StatementService statementService;
	
	
	@RequestMapping(path="/statement", method=RequestMethod.GET)
	public List<Statement> getAllStatement(){
		return statementService.getAllStatements();
		
	}
	
	@RequestMapping(path="/statement/{id}", method=RequestMethod.GET)
	public Statement getStatementById(long id) {
		return statementService.getStatementById(id);
		
	}
	


}


