package com.java.oops_concept;

class Bird4 {
	public String reproduction = "egg";
	public String outerCovering = "feather";

	public void flyUp() {
		System.out.println("Flying up...");
	}

	public void flyDown() {
		System.out.println("Flying down...");
	}
}

class Eagle3 extends Bird4 {
	public String name = "eagle";
	public int lifespan = 15;
}

public class SingleLevel_Inheritance {

	public static void main(String[] args) {

		Eagle3 myEagle = new Eagle3();

		System.out.println("Name: " + myEagle.name);
		System.out.println("Reproduction: " + myEagle.reproduction);
		System.out.println("Outer covering: " + myEagle.outerCovering);
		System.out.println("Lifespan: " + myEagle.lifespan);
		myEagle.flyUp();
		myEagle.flyDown();
	}

}
