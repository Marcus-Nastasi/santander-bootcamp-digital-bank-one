package com.santander.digital.bank.Entities.Exceptions;

import java.io.Serial;

public class AccountException extends Exception {

    @Serial
    private static final long serialVersionUID = 3L;

    public AccountException(String message) {
        super(message);
    }
}


