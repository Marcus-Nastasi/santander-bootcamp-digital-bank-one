package com.santander.digital.bank.Entities.Bank;

import com.santander.digital.bank.Entities.Account.Account;
import com.santander.digital.bank.Entities.Account.CurrentAccount;
import com.santander.digital.bank.Entities.Client.Client;
import com.santander.digital.bank.Entities.Exceptions.BankException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    private final String name;
    private final ArrayList<Account> accounts = new ArrayList<>();
    private final ArrayList<Client> clients = new ArrayList<>();

    public Bank(String name) throws Exception {
        if (name == null) throw new BankException("Error: bank does not have a name.");
        this.name = name;
        this.init();
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

    public void init() throws Exception {
        long id = 0;

        List<Client> clients1 = Arrays.asList(
            new Client(id++, "Gary Bean", "223-230-122-08"),
            new Client(id++, "Jullie Nog", "223-230-122-08"),
            new Client(id++, "Will Phill", "223-230-122-08"),
            new Client(id++, "Lauren Gereth", "223-230-122-08"),
            new Client(id++, "Shake Owen", "223-230-122-08"),
            new Client(id++, "Mark Fostil", "223-230-122-08")
        );

        List<Account> accounts1 = Arrays.asList(
            new CurrentAccount(1046, clients1.get(1)),
            new CurrentAccount(1046, clients1.get(2)),
            new CurrentAccount(1003, clients1.get(3)),
            new CurrentAccount(1017, clients1.get(4)),
            new CurrentAccount(1032, clients1.get(5)),
            new CurrentAccount(1078, clients1.get(6))
        );

        this.clients.addAll(clients1);
        this.accounts.addAll(accounts1);
    }
}


