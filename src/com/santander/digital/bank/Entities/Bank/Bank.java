package com.santander.digital.bank.Entities.Bank;

import com.santander.digital.bank.Entities.Account.Account;
import com.santander.digital.bank.Entities.Client.Client;

import java.util.ArrayList;

public class Bank {

    private String name;
    private final ArrayList<Account> accounts = new ArrayList<>();
    private final ArrayList<Client> clients = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}


