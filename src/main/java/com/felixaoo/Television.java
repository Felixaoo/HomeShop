package com.felixaoo;

public class Television extends Product {
        private int size;
    private String SladType;

    public Television(String name, String description, double price, int size, String Sladtype) {
        super(name, description, price);
        this.size = size;
        this.SladType = Sladtype;
    }

    public String getSladType() {
        return SladType;
    }

    public int getSize() {
        return size;
    }
}
