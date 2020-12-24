package com.java8.lambda;

interface interf3 {
	public int square(int x);
}

class CalculateSquare implements interf3 {
	public int square(int x) {
		return x * x;
	}
}

public class Example3 {

	public static void main(String[] args) {
		interf3 i = new CalculateSquare();
		System.out.println("Square=" + i.square(100));
	}

}
