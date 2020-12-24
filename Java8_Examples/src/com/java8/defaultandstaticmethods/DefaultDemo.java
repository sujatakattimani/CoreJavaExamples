package com.java8.defaultandstaticmethods;

//A simple program to Test Interface default 
//methods in java 
interface TestInterface {
	// abstract method
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}
}

class DefaultDemo implements TestInterface {
	// implementation of square abstract method
	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		DefaultDemo d = new DefaultDemo();
		d.square(4);

		// default method executed
		d.show();
	}
}
