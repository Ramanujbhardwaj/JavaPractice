package com.macys.reader;

import java.util.Scanner;

public class BinaryNumber {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int previous = 0;
        int consecutive = 0;
        int remainder = 0;
        while(n>0){
        	remainder = n%2;
        	n = n/2;
        	if(remainder == 1){
        		previous++;
        		if(previous >= consecutive){
        			consecutive = previous;
        		}
        	}else{
        		previous = 0;
        	}
        }
        System.out.println(consecutive);
    }
	
	

}
