package com.cybage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program{
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());	
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static void main4(String[] args) {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e);
//			System.out.println(e.toString());
			System.out.println(e.getMessage());	
		}
	}
	
	public static void main3(String[] args) {
		try {
			System.out.println("hii");
			System.out.println(10/0); 
			System.out.println("hello");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(10/2);
		}
		System.out.println("bye");
	}
	
	public static void main2(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println(10/2);
		}
		System.out.println("Bye");
	}
	
	public static void main1(String[] args) {
		PrintWriter pr;
		try {
			pr = new PrintWriter("abc.txt");
			pr.println("Hello");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
