package com.java.sujata;

public class AggregationDemo {

	public static void main(String[] args) {

		Product p1 = new Product(1, "Pen", "This is red pen");
		Product p2 = new Product(2, "Pencil", "This is pencil");
		Product p3 = new Product(3, "ColorBox", "This is color box");

		LineItem lineItem1 = new LineItem(1, 2, p1);
		//LineItem lineItem2 = new LineItem(1, 2, p2);
		//LineItem lineItem3 = new LineItem(1, 2, p3);

		// before deleting lineItem1
		System.out.println("***Before Delete***");
		System.out.println(lineItem1.getId());
		System.out.println(lineItem1.getQuantity());
		System.out.println(lineItem1.getP());

		// after deleting lineItem1...Still product exist and not deleted
		lineItem1 = null;
		System.out.println("\n***After Delete***");
		System.out.println(p1);
	}

}
