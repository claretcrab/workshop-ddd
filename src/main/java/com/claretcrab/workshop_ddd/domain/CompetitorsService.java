package com.claretcrab.workshop_ddd.domain;

import java.math.BigDecimal;
import java.util.HashMap;

// This is a Domain Service class
public class CompetitorsService {

    HashMap<String, Price> map;

    public CompetitorsService() {
        map = new HashMap<String, Price>();

        map.put("Ipad Pro", new Price(new BigDecimal(2)));
        map.put("Hero Ink Pen", new Price(new BigDecimal(34)));
        map.put("Reebok Cricket bat", new Price(new BigDecimal(56)));
    }

    public Price getDiscountPrice(Product product) {
        Price competitorsPrice = map.get(product.getName());
        BigDecimal discountAmount = new BigDecimal(competitorsPrice.getAmount().doubleValue() * 10 / 100);
        BigDecimal amount = new BigDecimal(competitorsPrice.getAmount().doubleValue() - discountAmount.doubleValue());

        return new Price(amount);
    }
    
}
