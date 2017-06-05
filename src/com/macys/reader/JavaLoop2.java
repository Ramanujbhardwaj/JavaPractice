package com.macys.reader;

import java.util.Scanner;

public class JavaLoop2 {
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int[] firstn ;
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            firstn = new int[n];
            callFunction(a, b, n);
        }
        in.close();
    }

	public static void callFunction(int a, int b, int n){
		int j = 0;
		int o = 2;
		int k = a;
		for(int i=0; i<n; i++){
			j += (b * Math.pow(o, i));
			System.out.print( k + j + " ");
		}
		
	}
	
}
