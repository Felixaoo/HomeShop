package com.felixaoo;

import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<String, Integer> products;

    public Bill(Customer customer) {
        this.customer = customer;
    }

    /**
     * add a product with a quantity in the bill
     * @param product the product to add
     * @param quantity the quantity of the product
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}
