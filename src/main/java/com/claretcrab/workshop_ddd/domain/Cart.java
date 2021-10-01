package com.claretcrab.workshop_ddd.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;


public class Cart {

    private UUID id;
    private List<Product> products;
    private List<Product> deletedProducts; //Could be a list of Domain Events
    private boolean hasCheckOut;

    public Cart() {
        id = UUID.randomUUID();
        products = new ArrayList<Product>();
        deletedProducts = new ArrayList<Product>();
        this.hasCheckOut = false;
    }

    public void add(Product product) {
        System.out.println("adding an product to the cart");
        products.add(product);
    }

    public boolean IsEmpty() {
        return products.isEmpty();
    }

    public boolean deletedProductsIsEmpty() {
        return deletedProducts.isEmpty();
    }

    public Integer getSize() {
        return products.size();
    }

    public Order checkout() {
        List<Product> orderProducts = new ArrayList<>();
        for (Product product : products) {
            for (int i = 0; i < product.getQuantity(); i++) { // Flatten quantity
                orderProducts.add(new Product(product.getName(), 1, product.getPrice(), product.getWeight()));
            }
        }

        this.hasCheckOut = true;

        return new Order(orderProducts);
    }

    public void removeByName(String name) {
        for (Iterator<Product> iterator = products.iterator(); iterator.hasNext(); ) {
            Product product = iterator.next();
            if (name.equals(product.getName())) {
                iterator.remove();
                deletedProducts.add(product);
            }
        }
    }
}