package com.santander.digital.bank.Entities.Account;

public abstract class Account implements IAccount {

    protected long id;
    protected int agency;
    protected double balance;

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(Account account, double value) {
        this.withdraw(value);
        account.deposit(value);
    }

    @Override
    public void bankStatement() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return("Account{" + "id=" + id + ", agency=" + agency + ", balance=" + balance + '}');
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


