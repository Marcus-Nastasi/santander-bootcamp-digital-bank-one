package com.santander.digital.bank;

import com.santander.digital.bank.Entities.Account.Account;
import com.santander.digital.bank.Entities.Bank.Bank;

public class Main {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank("Santander");
            bank.init();
            bank.getAccounts().forEach(a -> {
                if (a.getBalance() == 0) a.deposit(100.00);
            });
            //bank.getAccounts().forEach(System.out::println);
            bank.getAccounts().forEach(Account::bankStatement);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

