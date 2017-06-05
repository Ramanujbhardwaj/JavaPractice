package com.macys.reader;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		System.out.println(factorial(n));
		System.out.println(exponential(n, 4));
    }
	
	static int factorial(int j){
		if( j <= 1){
			return 1;
		}
		else{
			return (j * factorial(j-1));
		}
	}
	
	static int summation(int j){
		if( j <= 0){
			return 0;
		}else{
			return j + summation(j-1);
		}
	}
	
	static int exponential(int n, int p){
		if( p <= 0){
			return 1;
		}else{
			return n * exponential(n, (p-1));
		}
	}
}
