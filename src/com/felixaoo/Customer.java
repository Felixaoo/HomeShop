package com.felixaoo;

public class Customer {
    private String name;
    private String adress;

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public Customer(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
}
