package com.claretcrab.workshop_ddd;

import com.claretcrab.workshop_ddd.domain.Cart;
import com.claretcrab.workshop_ddd.domain.Product;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Cart cart = new Cart();
		Product ipad1 = new Product("Ipad Pro", 1);
		Product heroInkPen = new Product("Hero Ink Pen", 1);
		Product ReebokCricketbat = new Product("Reebok Cricket bat", 1);
		
		cart.add(ipad1);
		cart.add(heroInkPen);
		cart.add(ReebokCricketbat);
		cart.add(ReebokCricketbat);
	}

}
