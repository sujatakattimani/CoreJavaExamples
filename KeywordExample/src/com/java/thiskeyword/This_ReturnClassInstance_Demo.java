package com.java.thiskeyword;

// using 'this' keyword we can return current class instance.
public class This_ReturnClassInstance_Demo {

	int a, b;

	This_ReturnClassInstance_Demo() {
		a = 10;
		b = 20;
	}

	This_ReturnClassInstance_Demo get() {
		return this;
	}

	public void display() {
		System.out.println("a= " + a + "\nb= " + b);
	}

	public static void main(String[] args) {
		This_ReturnClassInstance_Demo t2= new This_ReturnClassInstance_Demo();
		t2.get().display();

	}

}
