package com.cybage;

/**some times to meet our programming requirements we can define our own exceptions
 * such type of exceptions are called, customised or used defined exceptions
 * example: TooYoungException
 * :TooOldException
 * :InSufficientFundsException, etc */

 class tooYoungException extends RuntimeException{
	tooYoungException(String s){
		super(s);					//To make description available to default exception handler.
	}
}

class tooOldException extends RuntimeException{
	tooOldException(String s){
		super(s);
	}
}


public class Program{
	public static void main(String[] args) {
//		int age = 85;
//		int age = 10;
		int age = 25;
		if (age > 60) {
			throw new tooOldException("Your age is too much.");
		}
		else if (age < 18) {
			throw new tooYoungException("You are too young to get married.");
		}
		else {
			System.out.println("You will get match details soon by email.");
		}
	}
}