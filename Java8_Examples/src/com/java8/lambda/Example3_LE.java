package com.java8.lambda;

@FunctionalInterface
interface interf4 {
	public int square(int x);
}

public class Example3_LE {

	public static void main(String[] args) {
		interf4 i = x -> x * x;
		System.out.println("Square=" + i.square(15));

	}

}
