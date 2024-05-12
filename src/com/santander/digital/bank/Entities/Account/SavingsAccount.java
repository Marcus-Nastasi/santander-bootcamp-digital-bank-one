package com.santander.digital.bank.Entities.Account;

import com.santander.digital.bank.Entities.Client.Client;

public class SavingsAccount extends Account {

    private static long SEQUENTIAL_SAVINGS = 0;

    public SavingsAccount(int agency, Client client) {
        super.client = client;
        super.agency = agency;
        super.id = SEQUENTIAL_SAVINGS++;
        super.balance = 0.0;
    }

    @Override
    public void bankStatement() {
        System.out.printf("--- %s's Savings Account ---\n", this.client.getName());
        super.bankStatement();
    }
}


