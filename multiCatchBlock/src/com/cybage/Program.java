package com.cybage;

import java.io.IOException;

/*
 * Until 1.6V even though multiple different exceptions having same handeling code,
 * for every exception type we had to write a seperate catch block.It increases length of the 
 * and reduces readability.
 * 
 * In multi catch block there should not be any relation between exception types,
 * either Parent to child or child to parent.
 */
public class Program {
	public static void main(String[] args) {
	}

//	public static void main(String[] args) {
//		try {
//			
//		} catch (ArithmeticException | Exception e) {		//CE
//			// TODO: handle exception
//		}
//	}

	public static void main1(String[] args) {
		try {
//			 System.out.println(10 / 0);
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException | NullPointerException e) {
//			 e.printStackTrace();
			System.out.println(e);
//			 } catch(NullPointerException | InterruptedException e){
//			 e.getMessage();
//			 }
		}
	}
}