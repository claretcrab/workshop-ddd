package com.claretcrab.workshop_ddd.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Price {
    private Currency currency;
    private BigDecimal amount;

    public Price(BigDecimal amount) {
        currency = Currency.getInstance("USD");
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
