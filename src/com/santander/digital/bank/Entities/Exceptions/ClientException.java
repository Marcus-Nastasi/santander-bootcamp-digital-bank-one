package com.santander.digital.bank.Entities.Exceptions;

import java.io.Serial;

public class ClientException extends Exception {

    @Serial
    private static final long serialVersionUID = 2L;

    public ClientException(String message) {
        super(message);
    }
}

