package com.claretcrab.workshop_ddd.domain;


public class Product {

    private String name;
    private Integer quantity; // Move to an Item class
    private Price price;
    private Integer weight;

    public Product(String name, Integer quantity, Price price, Integer weight) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
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

    public Integer getWeight() {
        return weight;
    }

}