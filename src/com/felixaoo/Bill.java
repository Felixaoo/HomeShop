package com.felixaoo;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Customer customer) {
        this.customer = customer;
        this.delivery = delivery;
    }

    /**
     * add a product with a quantity in the bill
     * @param product the product to add
     * @param quantity the quantity of the product
     */
    public void addProduct(Product product, Integer quantity){
        this.products.put( product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
