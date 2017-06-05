package com.macys.reader;

import java.math.BigDecimal;
import java.util.Scanner;

public class StandardDeviation {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int means = 0;
		BigDecimal mean = new BigDecimal(means);
		
		BigDecimal summeans = new BigDecimal(0);
		
		BigDecimal squareroot = new BigDecimal(0);
		
		BigDecimal sumbeforeroot = new BigDecimal(0);
		int array[] = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = in.nextInt();
			mean = mean.add(new BigDecimal(array[i]));
		}
		
		BigDecimal j = mean.divide(new BigDecimal(n));
		
		for(int i = 0; i < n ; i++){
			summeans = (j.subtract(new BigDecimal(array[i])));
			sumbeforeroot = sumbeforeroot.add(summeans.pow(2));
		}
		squareroot = sumbeforeroot.divide(new BigDecimal(n));
		System.out.printf("%.1f",Math.sqrt(squareroot.floatValue()));
		
	}

}
