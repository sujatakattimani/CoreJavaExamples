package com.java8.lambda;

@FunctionalInterface
interface interf2 {
	public void add1(int a, int b);
	// public void add2();
}

public class Example2_LE {

	public static void main(String[] args) {
		interf2 i = (a, b) -> System.out.println("\nThe addition of 2 no.s=" + (a + b));
		i.add1(10, 20);
	}

}
