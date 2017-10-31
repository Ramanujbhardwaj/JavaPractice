package com.macys.reader;

public class PalladiumIntegerJava {

	public static void main(String[] arg) {
		
		int a = 123321;
		int b = a;
		int remainder = 0;
		int reverse = 0;
		while(a > 0) {
			
			//First picking up the remainder
			remainder = a%10;
			//Taking the last number and multiplying it to 10 and adding to the previous number.
			//This way we will be creating the same number in reverse too.
			reverse = reverse * 10 + remainder;
			// Removing the last number from the original.
			a = a/10;
		}
		
		if(reverse == b) {
			System.out.println("PAlladium");
		}else {
			System.out.println("Not");
		}
	}
}
