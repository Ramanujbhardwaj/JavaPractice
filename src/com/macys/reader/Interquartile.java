package com.macys.reader;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Interquartile {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = scnr.nextInt();
		}
		int []num = new int[n];
		for (int i = 0; i < n; ++i) {
			num[i] = scnr.nextInt();
		}
		
		List<Integer> newarr = new ArrayList<Integer>();
		
		for(int i=0; i < n; ++i){
			for(int k=0; k<num[i]; ++k){
				newarr.add(arr[i]);	
			}
		}
		Collections.sort(newarr);
		List<Integer> sortedArray = new ArrayList<Integer>(newarr);
		Collections.reverse(newarr);
		List<Integer> reversesortedArray = new ArrayList<Integer>(newarr);
		Iterator<Integer> itr = newarr.iterator();
		
		double q1, q2, q3;
		
		if ((sortedArray.size() / 2) % 2 == 0) {
			int numb = sortedArray.size()/4;
			int secondm = sortedArray.get(numb);
			int rsecondm = reversesortedArray.get(numb);
			numb--;
			int firstm = sortedArray.get(numb);
	
			int rfirstnumb = reversesortedArray.get(numb);
			
			
			q1 = (new BigDecimal(firstm).add(new BigDecimal(secondm))).
					divide(new BigDecimal(2)).floatValue();
			

			q3 = (new BigDecimal(rfirstnumb).add(new BigDecimal(rsecondm))).
					divide(new BigDecimal(2)).floatValue();
		} else {
			int numb = sortedArray.size()/4;
			int secondm = sortedArray.get(numb);
			int rsecondm = reversesortedArray.get(numb);

			q1 = secondm;
			q3 = rsecondm;
		}
		
		System.out.printf("%.1f",(float)(q3-q1));
		
	}
	
}
