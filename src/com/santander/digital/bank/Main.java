package com.santander.digital.bank;

import com.santander.digital.bank.Entities.Account.Account;
import com.santander.digital.bank.Entities.Account.SavingsAccount;
import com.santander.digital.bank.Entities.Bank.Bank;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank("Santander");
            bank.init();
            bank.getAccounts().forEach(a -> a.deposit(100.00));

            System.out.println(bank.getAccounts());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

