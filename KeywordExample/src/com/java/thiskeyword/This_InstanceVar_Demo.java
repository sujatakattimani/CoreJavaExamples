package com.java.thiskeyword;

// Using 'this' keyword we can refer current class instance variables.
public class This_InstanceVar_Demo {

	int a, b;

	This_InstanceVar_Demo(int aa, int bb) {
		this.a = aa;
		this.b = bb;
	}

	public void display() {
		System.out.println("a= " + a + "\nb= " + b);
	}

	public static void main(String[] args) {
		This_InstanceVar_Demo t = new This_InstanceVar_Demo(10, 20);
		t.display();
	}
}
