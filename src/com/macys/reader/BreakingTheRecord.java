package com.macys.reader;

import java.util.Scanner;

public class BreakingTheRecord {

	
	static int[] getRecord(int[] s){
		int high = s[0];
		int low = s[0];
		int q = 0;
		int w = 0;
		for (int i=0; i < s.length; i++){
			int newhigh = s[i];
			int newlow = s[i];
				if(newhigh > high){
					high = newhigh;
					q++;
				}
				if(newlow < low){
					low = newlow;
					w++;
				}
		}
		int[] n = new int[2];
		n[0] = q;
		n[1] = w;
		return n;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
