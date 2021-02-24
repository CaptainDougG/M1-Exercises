package ex009;

public class Car {

	String make = "unknown";
	String model = "unknown";
	int numberOfDoors = 4;
	int topSpeed = 90;
	int price = 0;
	
    //add the constructors here
	public Car(String make, String model, int numberOfDoors, int topSpeed, int price) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	
	public Car(String make, String model, int topSpeed, int price) {
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	
	public Car( int numberOfDoors, int topSpeed, int price) {
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
	}
	
	public Car(String make, String model, int numberOfDoors) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;
	}
}
