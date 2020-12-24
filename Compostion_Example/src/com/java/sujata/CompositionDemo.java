package com.java.sujata;

public class CompositionDemo {

	public static void main(String[] args) {
		Product p1 = new Product(1, "Pen", "This is red pen.");
		Product p2 = new Product(2, "Pencil", "This is pencil");
		Product p3 = new Product(3, "ColorBox", "This is color box");
		
		
		Order o= new Order(1,"ORDER#1");
		o.addItem(1, 2, p1);
		o.addItem(2, 1, p2);
		o.addItem(3, 5, p3);
		
		System.out.println("Order---");
		System.out.println(o);
		
		o=null;
		
		System.out.println("\nOrder after deleted---");
		System.out.println(o);

	}

}
