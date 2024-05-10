package com.santander.digital.bank.Entities.Account;

public abstract class Account implements IAccount {

    private int id;
    private int agency;
    private double balance;

    public int getId() {
        return id;
    }

    public int getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }
}
