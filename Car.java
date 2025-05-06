package com.dyashin.interface_example;

public class Car extends Vehicle implements PassengerVehicle{

	public Car(int id, String licensePlate) {
		super(id, licensePlate);
		
	}

	@Override
	public void transferPeople() {
		System.out.println("Car carries 4 people");
		
	}

}
