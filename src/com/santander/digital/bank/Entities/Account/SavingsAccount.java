package com.santander.digital.bank.Entities.Account;

public class SavingsAccount extends Account {

    private static long SEQUENTIAL_SAVINGS = 0;

    public SavingsAccount(int agency) {
        super.agency = agency;
        super.id = SEQUENTIAL_SAVINGS++;
        super.balance = 0.0;
    }
}


