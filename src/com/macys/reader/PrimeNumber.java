package com.macys.reader;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		Integer[] testScores = new Integer[id];
		for(int i = 0; i < id; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i< testScores.length; i++){
			boolean isPrime = isPrimeNumber(testScores[i]);
			if(isPrime){
				System.out.println("Prime");
			}else{
				System.out.println("Not prime");
			}
		}
		
	}
	
	public static boolean isPrimeNumber(Integer j){
	
		if(j == 1){
			return false;
		}
		if(j == 2 || j == 3 || j == 5 || j == 7){
			return true;
		}
		for(int i = 2; i < Math.sqrt(j); i++){
			if(j%i == 0)
				return false;
		}
		
		return true;
	}
}
