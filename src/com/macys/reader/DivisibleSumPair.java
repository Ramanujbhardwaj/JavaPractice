package com.macys.reader;

import java.util.Scanner;

public class DivisibleSumPair {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = in.nextInt();
		}
		int count = 0;
		for(int i=0; i < n; i++){
			int first = a[i];
			for(int j=n-1; j > i; j--){
				int second = a[j];
				if(first+second == k || (first+second)%k == 0){
					count++;
				}
			}
		}
		System.out.println(count);
		// write your code here
	}

}
