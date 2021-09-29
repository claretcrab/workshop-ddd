package com.claretcrab.demo.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.claretcrab.workshop_ddd.domain.Cart;
import com.claretcrab.workshop_ddd.domain.Product;

import org.junit.jupiter.api.Test;

class CartTests {

	@Test
	void addIpadToCart() {
		var cart = new Cart();

		assertTrue(cart.IsEmpty());
		Product ipad1 = new Product("Ipad Pro", 1);
		cart.add(ipad1);
		assertFalse(cart.IsEmpty());
	}

	@Test
	void addTwoQuantitiesToCart() {
		var cart = new Cart();

		assertTrue(cart.IsEmpty());
		Product ipad1 = new Product("Ipad Pro", 2);
		cart.add(ipad1);
		assertTrue(2 == cart.getSize());
	}

}
