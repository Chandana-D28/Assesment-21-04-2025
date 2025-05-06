package com.dyashin.interface_example;

public class PickupTruck extends Vehicle implements ShipmentVehicle,PassengerVehicle{

	public PickupTruck(int id, String licensePlate) {
		super(id, licensePlate);
		
	}

	@Override
	public void transferPeople() {
		System.out.println("pickup truck transfer goods");
		
	}

	@Override
	public void transferGoods() {
		System.out.println("pickup truck carry 6 people");
		
	}

	
}
