package com.santander.digital.bank.Entities.Account;

import com.santander.digital.bank.Entities.Client.Client;
import com.santander.digital.bank.Entities.Exceptions.AccountException;

public abstract class Account implements IAccount {

    protected Client client;
    protected long id;
    protected int agency;
    protected double balance;

    @Override
    public void withdraw(double value) throws AccountException {
        if (this.balance < value) throw new AccountException("Error: balance lower than value " + value);
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(Account account, double value) throws AccountException {
        if (this.balance < value) throw new AccountException("Error: balance lower than value " + value);
        this.withdraw(value);
        account.deposit(value);
    }

    @Override
    public void bankStatement() {
        System.out.printf("--- %s's Account ---", this.client.getName());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return(
            "Account{" + "client=" + client + ", id=" + id +
            ", agency=" + agency + ", balance=" + balance + '}'
        );
    }

    public long getId() {
        return id;
    }

    public int getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }
}


