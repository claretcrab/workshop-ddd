package com.claretcrab.demo.domain;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import com.claretcrab.workshop_ddd.domain.Order;
import com.claretcrab.workshop_ddd.domain.Price;
import com.claretcrab.workshop_ddd.domain.Product;

import org.junit.jupiter.api.Test;

class OrderTests {

	@Test
	void calculateTotalAmount() {
	
		BigDecimal amount = new BigDecimal(12);
		Price price = new Price(amount);
		Product ipad1 = new Product("Ipad Pro", 1, price, 45);

		List<Product> products = Collections.singletonList(ipad1);

		Order order = new Order(products);
		Price totalAmount = order.calculateTotalAmount();

		assertTrue(totalAmount.getAmount().doubleValue() == 16.5);

		
	}

	

}
