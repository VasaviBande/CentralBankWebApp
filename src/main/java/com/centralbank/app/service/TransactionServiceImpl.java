package com.centralbank.app.service;

import com.centralbank.app.exception.InsufficientAccountBalanceException;
import com.centralbank.app.model.BankingTransactions;
import com.centralbank.app.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<BankingTransactions> getAllTransactions() {
        return null;
    }

    @Override
    public BankingTransactions getCurrentBalance(int customerId) {
        return transactionRepository.findOne(customerId);
    }

   /* @Override
    @Transactional
    public void transferFund(BankingTransactions fromAccount, BankingTransactions toAccount, Double amount) throws InsufficientAccountBalanceException {
        transactionRepository.withdraw(fromAccount, toAccount, amount);
        transactionRepository.deposit(fromAccount, toAccount, amount);
    }*/
}
