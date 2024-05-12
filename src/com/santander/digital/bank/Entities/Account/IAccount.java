package com.santander.digital.bank.Entities.Account;

import com.santander.digital.bank.Entities.Exceptions.AccountException;

public interface IAccount {

    void withdraw(double value) throws AccountException;
    void deposit(double value) throws AccountException;
    void transfer(Account account, double value) throws AccountException;
    void bankStatement();
}

