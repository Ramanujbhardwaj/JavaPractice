package com.macys.reader;

import java.math.BigDecimal;
import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] rra = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            rra[arr_i] = arr[arr_i];
        }
        java.util.Arrays.sort(arr,0,5);
        
        System.out.print(new BigDecimal(arr[0]).
        		add(new BigDecimal(arr[2])).
        		add(new BigDecimal(arr[3])).
        				add(new BigDecimal(arr[1])));
        System.out.print(" ");
        System.out.print(new BigDecimal(arr[1]).
        		add(new BigDecimal(arr[2])).
        		add(new BigDecimal(arr[3])).
        				add(new BigDecimal(arr[4])));
        
        
        
	}
}
