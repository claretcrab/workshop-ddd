package com.claretcrab.demo.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import com.claretcrab.workshop_ddd.domain.Cart;
import com.claretcrab.workshop_ddd.domain.Order;
import com.claretcrab.workshop_ddd.domain.Price;
import com.claretcrab.workshop_ddd.domain.Product;

import org.junit.jupiter.api.Test;

class CartTests {

	@Test
	void addIpadToCart() {
		var cart = new Cart();

		assertTrue(cart.IsEmpty());
		BigDecimal amount = new BigDecimal(12);
		Price price = new Price(amount);
		Product ipad1 = new Product("Ipad Pro", 1, price);
		cart.add(ipad1);
		assertFalse(cart.IsEmpty());
	}

	@Test
	void deleteAProductFromCart() {
		var cart = new Cart();

		assertTrue(cart.IsEmpty());
		assertTrue(cart.deletedProductsIsEmpty());

		BigDecimal amount = new BigDecimal(12);
		Price price = new Price(amount);
		Product ipad1 = new Product("Ipad Pro", 1, price);
		cart.add(ipad1);
		cart.removeByName("Ipad Pro");
		assertFalse(cart.deletedProductsIsEmpty());
	}

	@Test
	void twoCartsShouldNotBeEquals() {
		var cart1 = new Cart();
		var cart2 = new Cart();

		BigDecimal amount = new BigDecimal(12);
		Price price = new Price(amount);
		Product ipad1 = new Product("Ipad Pro", 1, price);

		cart1.add(ipad1);
		cart2.add(ipad1);

		assertFalse(cart1.equals(cart2));
	}

	@Test
	void createOrderWhenCartIsCheckout() {
		var cart = new Cart();

		BigDecimal amount = new BigDecimal(12);
		Price price = new Price(amount);
		Product ipad1 = new Product("Ipad Pro", 2, price);

		cart.add(ipad1);
		Order order = cart.checkout();
		assertTrue(order.getProducts().size() == 2);
	}

	@Test
	void addTwoQuantitiesToCart() {
		var cart = new Cart();

		assertTrue(cart.IsEmpty());
		BigDecimal amount = new BigDecimal(12);
		Price price = new Price(amount);
		Product ipad1 = new Product("Ipad Pro", 2, price);
		cart.add(ipad1);
		assertTrue(2 == cart.getSize());
	}

}
