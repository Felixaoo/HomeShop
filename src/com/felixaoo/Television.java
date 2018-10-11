package com.felixaoo;

public class Television extends Product {
    private String SladType;
    private int size;

    public Television(String name, String description, double price) {
        super(name, description, price);
    }

    public String getSladType() {
        return SladType;
    }

    public int getSize() {
        return size;
    }
}
