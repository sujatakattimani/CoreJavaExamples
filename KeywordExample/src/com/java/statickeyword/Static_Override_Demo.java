package com.java.statickeyword;

class Base{
	public static void display() {
		System.out.println("It will print...");
	}
}
public class Static_Override_Demo extends Base{
	public static void display() {
		Base.display();
		System.out.println("It will not print...");
	}
	public static void main(String[] args) {
		Base  b= new Static_Override_Demo();
		b.display(); // it hides the derived class method 

	}

}
