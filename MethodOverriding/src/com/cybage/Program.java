package com.cybage;

class  A{
	public void m1(int i){
		System.out.println("Parent class.");
	}
	
	private void m2() {
		System.out.println("Parent Private method.");
	}
	
	public final void m3() {
		System.out.println("Parent final method.");
	}
	
	public void m4() {
		System.out.println("Parent Non-final method.");
	}

	public Object m5() {
		return null;
	}
	
	public void m6() {
		System.out.println(); 		
	}
	
	protected void m7() {
		System.out.println("Parent class lower access modifier"); 		
	}
	
	public void m8(int...i) {
		System.out.println("Parent var-arg method.");
	}
	
}


class B extends A{
	@Override
	public void m1(int i) {
		System.out.println("Child Class.");
	}
	
//	@Override
//	private void m2() {
//		System.out.println();			//CE
//	}
	
//	@Override
//	public void m3() {
//		System.out.println("overriden child final method.");		//CE
//	}
	
	public final void m4() {
		System.out.println("Child final method.");
	}
	
//	@Override
//	public Object m5() {
//		return null;
//	}
	
	@Override
	public String m5() {		//From java 1.5 onwards covarient return types are allowed.
		return null;
	}
	
//	protected void m6() {
//									//scope of access modifier cannot be reduced.
//	}
	
	public void m7() {
		System.out.println("Child class incresed access modifier scope method."); 			//Scope of modifier can me increased but not decreased.	
	}
	
	public void m8(int i) {
		System.out.println("Child var-arg method.");
	}
	
//	public void m8(int...i) {
//		System.out.println("Child var-arg method.");
//	}
	
}

class C{
	public void a1() {
		System.out.println("Parent non abstract method.");
	}
}

abstract class D extends C{
	public abstract void a1();				//Non Abstract to abstract and Vice Versa allowed.

}


public class Program {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();					//Arguments are different hence method overloading takes place and 
		a.m8(10);						//not method overriding, hence method resolution taken care by compiler based on reference type.
		b.m8(10);
		a1.m8(10);
		
}
	
	public static void main7(String[] args) {
		A a = new A();
		B b = new B();
		a.m7();
		b.m7();
		
}
	
	public static void main6(String[] args) {
		C c = new C();
		c.a1();
		
		
}
	
	public static void main4(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();
		a.m4();
		b.m4();
		a1.m4();
}
	
	public static void main3(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();
		a.m3();
		b.m3();
		a1.m3();
}
	
	public static void main2(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();
		
//		a.m2(10);		//CE
//		b.m2(10);		//CE			
	}
	
	public static void main1(String[] args) {
		A a = new A();
		B b = new B();
		A a1 = new B();
		
		a.m1(10);
		b.m1(10);
		a1.m1(10);	
	}
}
