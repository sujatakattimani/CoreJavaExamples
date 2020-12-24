package com.java.superkeyword;

class Vehicle {
	int maxSpeed = 180;
}

class Car extends Vehicle {
	int maxSpeed = 200;

	void display() {
		System.out.println("Maximum Speed= " + super.maxSpeed);
	}
}

public class SuperWithVar_Demo {

	public static void main(String args[]) {
		Car c = new Car();
		c.display();
	}
}
