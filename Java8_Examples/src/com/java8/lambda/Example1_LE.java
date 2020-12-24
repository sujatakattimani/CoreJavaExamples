package com.java8.lambda;


@FunctionalInterface
interface Interface{
	public void m1();
	//public void m2();
}
public class Example1_LE {

	public static void main(String[] args) {
		Interface i= ()-> System.out.println("\n***Welcome to JAVA-8 Lambda Expression..***");
		i.m1();
	}

}
