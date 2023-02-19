package org.cybage;


class A {
//	public void sum(int a, int b) {
//		System.out.println("Parent: "+ (a + b));
//	}
	
	public void sum(int a, int b) {
		System.out.println("Parent: "+ (a + b));
	
		
	}
}

class B extends A{

//	public void sum(double a, double b) {
//		System.out.println("Child: "+ (a + b));
//	}
	
	@Override
	public void sum(int a, int b) {
		System.out.println("Child: "+ (a + b));

	}
}

public class Program {
	public static void main(String[] args) {
		A a = new A();
		a.sum(10, 20);
		
		B b = new B();
		b.sum(20, 30);
		
//		A a1 = new B();
//		a1.sum(50.25, 80.25);
		
		A a1 = new B();
		a1.sum(50, 80);
			
	}
}
