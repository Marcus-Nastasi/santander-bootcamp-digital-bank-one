package com.santander.digital.bank.Entities.Account;

import com.santander.digital.bank.Entities.Client.Client;

public class CurrentAccount extends Account {

    private static long SEQUENTIAL_CURRENT = 0;

    public CurrentAccount(int agency, Client client) {
        super.client = client;
        super.agency = agency;
        super.id = SEQUENTIAL_CURRENT++;
        super.balance = 0.0;
    }

    @Override
    public void bankStatement() {
        System.out.printf("--- %s's Current Account ---\n", this.client.getName());
        super.bankStatement();
    }
}


