package com.macys.reader;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[6];
		for(int arr_i=0; arr_i < 6; arr_i++){
                arr[arr_i] = in.nextInt();
            }
		Scanner in1 = new Scanner(System.in);
		int element = in1.nextInt();
		Arryas(arr);
		int finalelement = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(element == arr[i]) {
				finalelement = i;
				break;
			}
		}
		System.out.println("");
		System.out.println(finalelement);
	}
	
	public static void Arryas(int arra[]) {
		for(int i=0; i< arra.length; i++)
			System.out.print(arra[i] + " ");
		
	}

}
