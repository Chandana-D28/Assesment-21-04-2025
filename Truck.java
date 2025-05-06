package com.dyashin.interface_example;

public class Truck extends Vehicle implements ShipmentVehicle {

	public Truck(int id, String licensePlate) {
		super(id, licensePlate);
		
	}

	@Override
	public void transferGoods() {
		System.out.println("Truck transfers Rice loads");
		
	}

}
