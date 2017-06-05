package com.macys.reader;

import java.util.Scanner;

public class DayofProgrammer {
	
	 static String solve(int year){
		 int feb = 0;
		 
		 if(year < 1919){
			 if(year%4 == 0){
				 feb=29;
			 }else{
				 feb = 28;
			 }
			 if(year == 1918){
				 feb = feb-13;
			 }
		 }
		 
		 if(year > 1918){
			 if(year % 400 ==0 || (year % 4 == 0 && year % 100 !=0 )){
				 feb = 29;
			 }else{
				 feb = 28;
			 }
		 } 
			 int totaldays = 31+ feb + 31 + 30 + 31 + 30 + 31 + 31 ;
			 
			 int day = 256 - totaldays;
			 
			 return day + ".09 " + year;
		 }
		 
//	        int k=0;
//	        
//	        if(year < 1919){
//	            if(year%4 == 0) k= 29;
//	            else k= 28;
//	            
//	            if(year == 1918) k= k-13; // k - 13 as 14 is the 32th day. this means that there was a reduction of 13 dias.
//	        }
//	        if(year > 1918){
//	            if(year%400==0 || (year%4==0 && year%100!=0)) k= 29;
//	            else k= 28;        
//	        }
//	        
//
//	        int sum = 31 + k + 31 + 30 + 31 + 30 + 31 + 31;
//	        int day = 256-sum;
//	        
//	        return day+".09."+year;
	    

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int year = in.nextInt();
	        String result = solve(year);
	        System.out.println(result);
	    }

}
