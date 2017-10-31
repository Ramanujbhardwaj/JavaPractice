package com.macys.reader;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		int arr[] = new int[8];
		for(int arr_i=0; arr_i < 8; arr_i++){
                arr[arr_i] = in.nextInt();
            }
		
		Scanner in1 = new Scanner(System.in);
		int element = in1.nextInt();

		int number = binarySearchArrya(arr, 0, arr.length-1, element);
		System.out.println(number);
	}
	
	public static int binarySearchArrya(int arr[], int start, int end, int findNumber) {

		if(end >= start) {
		
			int middle = start + (end-start)/2;
			
			if(arr[middle]==findNumber)
				return middle;
			
			if(arr[middle] > findNumber)
				return binarySearchArrya(arr, start, middle-1, findNumber);
			else
				return binarySearchArrya(arr, middle+1, end, findNumber);
			
		}
		
		return -1;
	}
}
