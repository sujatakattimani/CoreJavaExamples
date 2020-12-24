package com.java8.defaultandstaticmethods;

//A simple Java program to TestClassnstrate static 
//methods in java 
interface TestInterface3 
{ 
	// abstract method 
	public void square (int a); 

	// static method 
	static void show() 
	{ 
		System.out.println("Static Method Executed"); 
	} 
} 

class StaticDemo implements TestInterface3 
{ 
	// Implementation of square abstract method 
	public void square (int a) 
	{ 
		System.out.println(a*a); 
	} 

	public static void main(String args[]) 
	{ 
		StaticDemo d = new StaticDemo(); 
		d.square(4); 

		// Static method executed 
		TestInterface3.show(); 
	} 
} 
