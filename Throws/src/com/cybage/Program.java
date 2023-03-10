package com.cybage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**Throws keyword is used to delegate the responsibility of exception
 * handling to calle*/
/**
 * In our program if there is a possibility of rising checked exception, then it
 * is compulsory to handle that checked exception otherwise we will get compile
 * time error saying Unhandled exception type FileNotFoundException* Throws
 * keyword required only for checked exception, it is of no use for unchecked
 * exception
 */

class Test2{
	public void m1(){
		throw new Error();
	}
}

class Test1{
	public void m1() throws Exception {
		throw new Exception();
	}
}

class Test extends RuntimeException{
	public void m1() throws Test {
		System.out.println("m1");
	}
}

public class Program {
	public static void main(String[] args){
		Test2 t = new Test2();
		t.m1();
	}
	
	public static void main8(String[] args) throws Exception {
		Test1 t = new Test1();
		t.m1();
	}
	
	public static void main7(String[] args) {
		Test t = new Test();
		t.m1();
	}
	
	public void main6(String[] args) {
		doStuff();
	}
	public static void doStuff() {
		try {
			doMoreStuff();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void doMoreStuff() throws InterruptedException {
			Thread.sleep(1000);
	}

//	public static void main5(String[] args) throws InterruptedException {
//		doStuff();
//	}
//	public static void doStuff() throws InterruptedException {
//		doMoreStuff();
//	}
//	public static void doMoreStuff() throws InterruptedException {
//			Thread.sleep(1000);	
//	}

//	public static void main4(String[] args) {
//		doStuff();
//	}
//	public static void doStuff() {
//		doMoreStuff();
//	}
//	public static void doMoreStuff() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public static void main3(String[] args) {
		System.out.println("Hello");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Bye");
	}

	public static void main2(String[] args) throws InterruptedException {
		System.out.println("Hello");
		Thread.sleep(10000);
		System.out.println("Bye");
	}

	public static void main1(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("Hello");
	}
}