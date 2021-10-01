package com.claretcrab.workshop_ddd;

import java.math.BigDecimal;

import com.claretcrab.workshop_ddd.domain.Cart;
import com.claretcrab.workshop_ddd.domain.Order;
import com.claretcrab.workshop_ddd.domain.Price;
import com.claretcrab.workshop_ddd.domain.Product;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Cart cart = new Cart();
		BigDecimal amount = new BigDecimal(12);
		Price price = new Price(amount);
		Product ipad1 = new Product("Ipad Pro", 1, price, 45);
		Product heroInkPen = new Product("Hero Ink Pen", 2, price, 45);
		Product ReebokCricketbat = new Product("Reebok Cricket bat", 1, price, 55);
		
		cart.add(ipad1);
		cart.add(heroInkPen);
		cart.add(ReebokCricketbat);
		cart.add(ReebokCricketbat);

		cart.removeByName("Ipad Pro");

		Order order = cart.checkout();
		System.out.println(order.getProducts());
	}

}
