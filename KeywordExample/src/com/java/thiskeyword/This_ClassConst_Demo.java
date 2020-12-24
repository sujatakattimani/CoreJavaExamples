package com.java.thiskeyword;

// using 'this' keyword we can invoke current class constructor.
public class This_ClassConst_Demo {

	int a, b;

	This_ClassConst_Demo() {
		this(10,20);
		System.out.println("Inside default constructor");
	}

	public This_ClassConst_Demo(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
		System.out.println("a= " + a + "\nb= " + b);
	}

	public static void main(String[] args) {
		This_ClassConst_Demo t1 = new This_ClassConst_Demo();
	}

}
