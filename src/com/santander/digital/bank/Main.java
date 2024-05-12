package com.santander.digital.bank;

import com.santander.digital.bank.Entities.Account.Account;
import com.santander.digital.bank.Entities.Account.SavingsAccount;
import com.santander.digital.bank.Entities.Bank.Bank;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank("Santander");
            bank.getAccounts().forEach(a -> a.deposit(100.00));

            List<Account> sa = bank.getAccounts().stream().filter(a -> a instanceof SavingsAccount).toList();
            sa.forEach(Account::bankStatement);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

