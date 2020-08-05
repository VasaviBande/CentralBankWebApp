package com.centralbank.app.service;

import com.centralbank.app.exception.InsufficientAccountBalanceException;
import com.centralbank.app.model.BankingTransactions;
import java.util.List;

public interface TransactionService {

    List<BankingTransactions> getAllTransactions();

    BankingTransactions getCurrentBalance(int customerId);

    //void transferFund(BankingTransactions fromAccount, BankingTransactions toAccount, Double amount) throws InsufficientAccountBalanceException;

}
