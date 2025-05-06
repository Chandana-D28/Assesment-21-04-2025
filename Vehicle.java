package com.dyashin.interface_example;

public abstract class Vehicle {
	private long id;
	private String licensePlate;
	public Vehicle(int id,String licensePlate) {
		this.id=id;
		this.licensePlate=licensePlate;
	}
	public void displayDetails() {
		System.out.println("Vehicle ID:"+id);
		System.out.println("License plate:"+licensePlate);
		
	}
	

}
