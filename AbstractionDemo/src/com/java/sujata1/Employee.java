package com.java.sujata1;

public abstract class Employee {
	private String name;
	private int paymentPerHour;

	public Employee(String name, int paymentPerHour) {
		super();
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	// abstract method
	public abstract int calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaymentPerHour() {
		return paymentPerHour;
	}

	public void setPaymentPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}

}
