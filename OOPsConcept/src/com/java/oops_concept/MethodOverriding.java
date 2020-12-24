package com.java.oops_concept;

class Animal3{
	public void eat() {
		System.out.println("This animal eats insects.");
	}
}
class Bird3 extends Animal3{
	public void eat(){
		System.out.println("This bird eats seeds.");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		Animal3 myAnimal = new Animal3();
		myAnimal.eat();
		
		Bird3 myBird = new Bird3();
		myBird.eat();
	}

}
