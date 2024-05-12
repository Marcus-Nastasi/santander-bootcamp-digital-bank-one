package com.santander.digital.bank.Entities.Client;

public class Client {

    private long id;
    private String name;
    private String cpf;

    public Client(long id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return("Client{" + "id=" + id + ", name='" + name + '\'' + ", cpf='" + cpf + '\'' + '}');
    }
}

