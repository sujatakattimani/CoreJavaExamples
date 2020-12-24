package com.java8.lambda;

@FunctionalInterface
interface interf5 {
	public void m1();
}

public class Example4 {
	int a = 777;

	public void m2() {
		int b = 888;
		interf5 i = () -> {
			int a = 999;
			//int b=1111;
			System.out.println(this.a); // when we use this keyword then it represents current outer class object reference.
			System.out.println(b);
			System.out.println(a); // it prints local variable.
			//b=1000; //CE
		};
		i.m1();
		
	}

	public static void main(String[] args) {
		Example4 t = new Example4();
		t.m2();

	}

}
