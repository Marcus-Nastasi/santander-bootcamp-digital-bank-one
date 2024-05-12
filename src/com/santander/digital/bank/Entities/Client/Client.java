package com.santander.digital.bank.Entities.Client;

import com.santander.digital.bank.Entities.Exceptions.ClientException;

public class Client {

    private final long id;
    private final String name;
    private final String cpf;

    public Client(long id, String name, String cpf) throws ClientException {
        if (name == null || cpf == null) throw new ClientException("Error: missing name or cpf");
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return("Client{" + "id=" + id + ", name='" + name + '\'' + ", cpf='" + cpf + '\'' + '}');
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

