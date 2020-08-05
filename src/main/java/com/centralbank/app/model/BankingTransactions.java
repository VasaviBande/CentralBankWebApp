package com.centralbank.app.model;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "banking_transactions")
public class BankingTransactions {

    public BankingTransactions() {
    }


    @Column(name = "Transaction_id")
    private long transactionId;

    @Column(name = "Transaction_Type")
    private String transactionType;

    @Column(name = "Description")
    private String description;

    @Column(name = "Amount")
    private double amount;

    @Column(name = "Date")
    private Date date;

    @Id
    @Column(name = "Customer_id")
    private int customerId;

    @Column(name = "Current_Bal")
    private double currentBal;

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getCurrentBal() {
        return currentBal;
    }

    public void setCurrentBal(double currentBal) {
        this.currentBal = currentBal;
    }
}
