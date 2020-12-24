package com.java.oops_concept;

class Bird2 {
	public void fly() {
		System.out.println("The bird is flying.");
	}

	public void fly(int height) {
		System.out.println("The bird is flying " + height + " feet high.");
	}

	public void fly(String name, int height) {
		System.out.println("The " + name + " is flying " + height + " feet high.");
	}
}

public class MethodOverloading {

	public static void main(String[] args) {

		Bird2 myBird = new Bird2();

		myBird.fly();
		myBird.fly(10000);
		myBird.fly("eagle", 10000);

	}

}
