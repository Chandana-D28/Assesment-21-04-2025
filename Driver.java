package com.dyashin.interface_example;

public class Driver {
	public static void main(String[] args) {
		Truck truck = new Truck(1, "123qwe");
		truck.displayDetails();
		truck.transferGoods();
		System.out.println("-------------------------");
		PickupTruck  pickupTruck = new PickupTruck (2, "123ABC");
		pickupTruck.displayDetails();
		pickupTruck.transferGoods();
		pickupTruck.transferPeople();
		System.out.println("-------------------------");
		Car car=new Car(3,"345GHY");
		car.displayDetails();
		car.transferPeople();
		
		

	}
}
