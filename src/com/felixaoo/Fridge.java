package com.felixaoo;

public class Fridge extends Product {
    private int liter;
    private boolean freezer;

    public Fridge(String name, String description, double price) {
        super(name, description, price);
    }

    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return freezer;
    }
}
