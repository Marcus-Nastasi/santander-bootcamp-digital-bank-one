package com.santander.digital.bank.Entities.Account;

public class CurrentAccount extends Account {

    private static long SEQUENTIAL_CURRENT = 0;

    public CurrentAccount(int agency) {
        super.agency = agency;
        super.id = SEQUENTIAL_CURRENT++;
        super.balance = 0.0;
    }

}

