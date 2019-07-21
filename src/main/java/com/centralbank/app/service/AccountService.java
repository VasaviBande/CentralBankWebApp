package com.centralbank.app.service;

import java.util.List;
import com.centralbank.app.model.Account;


public interface AccountService {
	
	public List<Account> getAcById(long id);

}
