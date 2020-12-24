package com.java.superkeyword;

class Person {
	void message() {
		System.out.println("This is person class.");
	}
}

class Student extends Person {
	void message() {
		System.out.println("This is student class.");
	}

	void display() {
		super.message();
		message();
	}
}

public class SuperWithMethods_Demo {

	public static void main(String[] args) {

		Student s = new Student();
		s.display();
	}

}
