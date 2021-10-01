package com.claretcrab.workshop_ddd.domain;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public Price calculateTotalAmount() {
        Double totalWeight = 0.0;
        Double totalAmount = 0.0;
        for (Product product : products) {
            totalWeight = totalWeight + product.getWeight() * 0.1;
            totalAmount = totalAmount + product.getPrice().getAmount().doubleValue();
        }

        return new Price(new BigDecimal(totalAmount + totalWeight));
    }
    
}
