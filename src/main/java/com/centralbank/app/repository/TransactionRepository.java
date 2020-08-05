package com.centralbank.app.repository;

import com.centralbank.app.exception.InsufficientAccountBalanceException;
import com.centralbank.app.model.BankingTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<BankingTransactions, Integer> {

    //void deposit(BankingTransactions fromAccount, BankingTransactions toAccount, Double amount);
    //void withdraw(BankingTransactions fromAccount, BankingTransactions toAccount, Double amount) throws InsufficientAccountBalanceException;

}
