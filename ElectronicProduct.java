package com.dyashin.assignment.ecommerce;

public class ElectronicProduct extends Product{
	public int warrantyInMonths;

	public ElectronicProduct(int id, String name, float price, int quantity, int warrantyInMonths) {
		super(id, name, price, quantity);
		this.warrantyInMonths = warrantyInMonths;
	}

	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", warrantyInMonths=" + warrantyInMonths+"]";
	}

	
	
	
}
