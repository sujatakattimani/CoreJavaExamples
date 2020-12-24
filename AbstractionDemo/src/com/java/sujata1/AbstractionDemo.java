package com.java.sujata1;

public class AbstractionDemo {

	public static void main(String[] args) {
		Employee c = new Contractor("Contractor", 10, 10);
		Employee f = new FullTimeEmployee("Full time employee", 8);
		System.out.println("Salary C-->" + c.calculateSalary());
		System.out.println("Salary F-->" + f.calculateSalary());

	}

}
