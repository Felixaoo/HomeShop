package com.felixaoo;

public class Customer {
    private String name;
    private String adress;

    public String getFullName() {
        return name;
    }

    public String getAddress() {
        return adress;
    }

    public Customer(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
}
