package com.centralbank.app.exception;

public class InsufficientAccountBalanceException extends Exception {

    public InsufficientAccountBalanceException(String message) {
        super(message);
    }
}
