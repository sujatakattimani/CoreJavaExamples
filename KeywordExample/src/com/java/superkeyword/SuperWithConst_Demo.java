package com.java.superkeyword;

class A {
	A() {
		System.out.println("A--> Base class");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("B--> Child class");
	}
}

public class SuperWithConst_Demo {

	public static void main(String[] args) {
		B b = new B();

	}

}
