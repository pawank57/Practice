package com.cybage;

public class Program{
	static ArithmeticException e1;
	public static void main(String[] args) {
		throw e1;
	}
	
	static ArithmeticException e = new ArithmeticException();
	public static void main3(String[] args) {
		throw e;
	}
	
	public static void main2(String[] args) {
		throw new ArithmeticException("/ by zero");
	}
	
	public static void main1(String[] args) {
		System.out.println(10/0);
	}
}