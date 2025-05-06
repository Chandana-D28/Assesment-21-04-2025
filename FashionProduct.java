package com.dyashin.assignment.ecommerce;

public class FashionProduct extends Product{

	public String size;

	public FashionProduct(int id, String name, float price, int quantity, String size) {
		super(id, name, price, quantity);
		this.size = size;
		
	}

	public String toString() {
		return "FashionProduct [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", size=" + size+"]";
	}
	


	
	
	
}
