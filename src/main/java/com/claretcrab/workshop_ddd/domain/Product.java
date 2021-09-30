package com.claretcrab.workshop_ddd.domain;


public class Product {

    private String name;
    private Integer quantity; // Move to an Item class
    private Price price;

    public Product(String name, Integer quantity, Price price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

}