package com.macys.reader;

import java.util.Scanner;

public class SelectionSort {

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		int arr[] = new int[6];
		for(int arr_i=0; arr_i < 6; arr_i++){
                arr[arr_i] = in.nextInt();
            }
		Arryas(arr);
		System.out.println("");
		for(int i=0; i<arr.length - 1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		Arryas(arr);

	}
	
	public static void Arryas(int arra[]) {
		for(int i=0; i< arra.length; i++)
			System.out.print(arra[i] + " ");
		
	}
}
