package com.cybage;

/**
 * Try: to maintain risky code. catch: to maintain exception handling code.
 * finally : to maintain cleanup code. throw: to handover our created exception
 * object to the jvm mannually. throws: To delegate the responsibility of
 * exception handling to the caller.
 * 
 */

public class Program {
	public static void main(String[] args) {
		doStuff();
	}

	public static void doStuff() {
		doMoreStuff();
	}

	public static void doMoreStuff() {
		System.out.println("Hello"); // Hello
	}
}

//public class Program{
//	public static void main(String[] args) {
//		doStuff();
//	}
//	
//	public static void doStuff() {
//		doMoreStuff();
//	}
//	public static void doMoreStuff() {
//		System.out.println(10/0);			
//	}
//	
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at com.cybage.Program.doMoreStuff(Program.java:16)
//	at com.cybage.Program.doStuff(Program.java:10)
//	at com.cybage.Program.main(Program.java:6)
//}

//public class Program {
//	public static void main(String[] args) {
//		doStuff();
//	}
//
//	public static void doStuff() {
//		doMoreStuff();
//		System.out.println(10 / 0);
//	}
//
//	public static void doMoreStuff() {
//		System.out.println("Hello");
//	}
//	
//	Hello
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.cybage.Program.doStuff(Program.java:42)
//		at com.cybage.Program.main(Program.java:37)
//		
//}

//public class Program {
//	public static void main(String[] args) {
//		doStuff();
//		System.out.println(10/0);
//	}
//
//	public static void doStuff() {
//		doMoreStuff();
//		System.out.println("hii");
//	}
//
//	public static void doMoreStuff() {
//		System.out.println("Hello");
//	}
//	
//	Hello
//	hii
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at com.cybage.Program.main(Program.java:58)
//}
