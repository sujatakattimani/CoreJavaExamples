package com.java.oops_concept;

interface Animal1 {
	public void eat();

	public void sound();
}

interface Bird1 {
	int numberOfLegs = 2;
	String outerCovering = "feather";

	public void fly();
}

class Eagle implements Animal1, Bird1 {
	public void eat() {
		System.out.println("Eats reptiles and amphibians..");
	}

	public void sound() {
		System.out.println("Has a high-pitched whistling sound..");
	}

	public void fly() {
		System.out.println("Flies up to 10,000 feet..");
	}
}

public class TestEagle_Interface {
	public static void main(String args[]) {
		Eagle myEagle = new Eagle();
		myEagle.eat();
		myEagle.sound();
		myEagle.fly();

		System.out.println("Number of legs: " + Bird1.numberOfLegs);
		System.out.println("Outer covering: " + Bird1.outerCovering);

	}
}
