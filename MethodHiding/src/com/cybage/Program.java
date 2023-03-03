package com.cybage;

class A {
	public static void m1() {
		System.out.println("Parent Method..");
	}
}

class B extends A {
	public static void m1() {
		System.out.println("Child Method..");
	}
}

public class Program {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();

		a.m1(); // Parent Method..
		b.m1(); // Child Method..
		a1.m1(); // Parent Method..(Method hiding) //Method resolution taken care by compiler
					// based on
					// reference
	}
}
