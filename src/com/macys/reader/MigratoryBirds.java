package com.macys.reader;

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] types = new int[n];
		for(int types_i=0; types_i < n; types_i++){
			types[types_i] = in.nextInt();
		}
		// your code goes here

		String source = Arrays.toString(types);
		int arr1 = source.split("1").length-1;
		int arr2 = source.split("2").length-1;
		int arr3 = source.split("3").length-1;
		int arr4 = source.split("4").length-1;
		int arr5 = source.split("5").length-1;
		int max = Math.max(arr1, Math.max(arr2,Math.max(arr3, Math.max(arr4,arr5))));
		if(max == arr1){
			System.out.println("1");
		}else if(max == arr2){
			System.out.println("2");
		}else if(max == arr3){
			System.out.println("3");
		}else if(max == arr4){
			System.out.println("4");
		}else{
			System.out.println("5");
		}
	}

}

