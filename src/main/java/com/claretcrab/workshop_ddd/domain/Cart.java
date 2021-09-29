package com.claretcrab.workshop_ddd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Product> products;

    public Cart() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        System.out.println("adding an product to the cart");
        products.add(product);
    }

    public boolean IsEmpty() {
        return products.isEmpty();
    }

    public Integer getSize() {
        return products.size();
    }
}