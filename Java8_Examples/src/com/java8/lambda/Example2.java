package com.java8.lambda;

interface interf1 {
	public void add(int a, int b);
}

class Demo1 implements interf1 {
	public void add(int a, int b) {
		System.out.println("\nAddtion of 2 no.s= " + (a + b));
	}
}

public class Example2 {

	public static void main(String[] args) {
		interf1 i = new Demo1();
		i.add(10, 20);
	}

}
