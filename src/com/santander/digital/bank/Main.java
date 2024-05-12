package com.santander.digital.bank;

import com.santander.digital.bank.Entities.Bank.Bank;

public class Main {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank("Santander");
            bank.init();
            bank.getAccounts().forEach(System.out::println);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

