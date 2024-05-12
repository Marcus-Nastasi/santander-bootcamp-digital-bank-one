package com.santander.digital.bank.Entities.Exceptions;

import java.io.Serial;

public class BankException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    public BankException(String message) {
        super(message);
    }
}

