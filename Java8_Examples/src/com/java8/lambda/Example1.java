/**
 * @author Sujata Kattimani
 * 
 * Title: Example1 without Lambda Expression
 *
 */
package com.java8.lambda;

@FunctionalInterface
interface Interf{
	public void m1();
	//public void m2();
	default void m3() {}
	public static void m4() {}
}
class Demo implements Interf{
	public void m1() {
		System.out.println("\n*****Welcome to JAVA-8******");
	}
}
public class Example1 {
	public static void main(String[] args) {
		Interf i = new Demo();
		i.m1();
		
		//OR
		
		//Demo d = new Demo();
		//d.m1();
	}

}
