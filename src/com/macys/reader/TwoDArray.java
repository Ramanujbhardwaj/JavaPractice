package com.macys.reader;

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int n = 0;
        int k = Integer.MIN_VALUE;
        for(int i=0; i < 4; i++){
        	for (int j=0; j < 4; j++){
        		n = arr[i][j] + arr[i][j+ 1] + arr[i][j + 2] 
        				+ arr[i + 1][j + 1] + arr[i + 2][j] 
        						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
        		if(n>k)
        			k=n;
        	}
        }
        System.out.println(k);
	}

}
