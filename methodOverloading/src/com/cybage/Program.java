package com.cybage;

class A{
	public void m1() {
		System.out.println("No Args.");
	}
		
	public void m1(int i) {
		System.out.println("Int arg.");
	}
	
	public void m1(long k) {
		System.out.println("Long arg.");
	}
	
	public void m1(double j) {
		System.out.println("Double arg.");
	}

	public void m1(Object obj) {
		System.out.println("Object Version");
	}
	
	public void m1(String s) {
		System.out.println("String Version");
	}
	
//	public void m1(StringBuffer sb) {
//		System.out.println("StringBuffer Version");
//	}
	
	public void m1(int... i1) {
		System.out.println("Var Arg method");
	}
	
	public void m1(int i, float f) {
		System.out.println("Int float version.");
	}
	
	public void m1(float i, int f) {
		System.out.println("float Int version.");
	}
	
	
}

public class Program{
	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.m1(10);
		a.m1(10.5);
		a.m1('a');
		
		a.m1(10.5f);		//Double arg(Automatic promotion in overloading.)
		a.m1(new Object());
		a.m1("Pawan");
		
//		a.m1(null);
		a.m1(10, 20, 30);
		
		a.m1(10, 10.4f);
		a.m1(10.5f, 10);
//		a.m1(10, 10);
		
	}
}
