package com.dyashin.assignment.ecommerce;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.userLogin();
		ElectronicProduct eProduct = new ElectronicProduct(1, "Mobile", 10000, 1, 2);
		FashionProduct fProduct = new FashionProduct(2, "Kurtha", 100, 1, "L");
		Cart cart = new Cart();
		cart.add(eProduct);
		cart.add(fProduct);
		cart.display();

	}

}
