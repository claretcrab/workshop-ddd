package com.claretcrab.workshop_ddd.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;


public class Cart {

    UUID id;
    List<Product> products;
    List<Product> deletedProducts; //Could be a list of Domain Events

    public Cart() {
        id = UUID.randomUUID();
        products = new ArrayList<Product>();
        deletedProducts = new ArrayList<Product>();
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

    public void removeByName(String name) {
        for (Iterator<Product> iterator = products.iterator(); iterator.hasNext(); ) {
            Product product = iterator.next();
            if (name.equals(product.name)) {
                iterator.remove();
                deletedProducts.add(product);
            }
        }

        /*for (Product product : products) {
            if (name.equals(product.name)) {
                //products.remove(product);
                products.remove(product);
                deletedProducts.add(product);
            }
        }*/
    }
}