package com.centralbank.app.service;

import com.centralbank.app.model.Account;
import com.centralbank.app.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accRepo;

    @Override
    public Account getAcById(int id) {

        return accRepo.findOne(id);
    }
}
