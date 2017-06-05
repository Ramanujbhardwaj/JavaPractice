package com.macys.reader;

import java.util.*;
import java.lang.reflect.Array;
import java.math.*;
import java.text.DecimalFormat;

public class Arithmetic {

  /*  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        BigDecimal tipAmount = new BigDecimal(mealCost).multiply(new BigDecimal(tipPercent).divide(new BigDecimal(100)));
        System.out.println(tipAmount);
        BigDecimal taxAmount = new BigDecimal(mealCost).multiply(new BigDecimal(taxPercent).divide(new BigDecimal(100)));
        BigDecimal totalCosts = new BigDecimal(mealCost).add(tipAmount).add(taxAmount);
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalCosts.doubleValue());
        System.out.println("The total meal cost is " + totalCost + " dollars.");
        // Print your result
    }*/
	
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int j = 0;
//        for (int i=1; i <= 10; i++){
//        	
//        	System.out.println( n + " x " + i + " = " + new BigDecimal(n).multiply(new BigDecimal(i)));
//        }
	
	/*
	 * Below is the logic to find mean & mode using Arrays and sort functionality.
	 */
//	public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//		Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        
//        int s = new BigDecimal(n).divide(new BigDecimal(2),RoundingMode.HALF_EVEN).intValue();
//        
//        int arr[] = new int[n];
//        java.util.Arrays.sort(arr,0,n) ;
//        
//        
//        BigDecimal mean = new BigDecimal(0);
//        for(int arr_i=0; arr_i < n; arr_i++){
//            arr[arr_i] = in.nextInt();
//            int j = arr[arr_i];
//            mean = mean.add(new BigDecimal(j));
//        }
////        String a = mean.divide(new BigDecimal(n)).toString();
//        java.util.Arrays.sort( arr,0,n) ;
//        int mode = modeOfArray(arr);
//        BigDecimal r = (new BigDecimal(arr[s]).add(new BigDecimal(arr[s-1]))).divide(new BigDecimal(2));
//        System.out.println(mean.divide(new BigDecimal(n)));
//        System.out.println(r.ROUND_HALF_EVEN);
//        System.out.println(mode);
//        //System.out.println(a.format("%.2f",as));
//       
//    }
//	public static int modeOfArray(int[] array){
//	    int mode = 0;     
//	    int maxOccurance = 0;
//
//	    for(int i=0; i<array.length; i++){
//	        int occuranceOfThisValue = 0;
//	        for(int j=0; j<array.length; j++){
//	            if(array[i] == array[j])
//	               occuranceOfThisValue++;
//	        }
//
//	        if(occuranceOfThisValue > maxOccurance){
//	            maxOccurance = occuranceOfThisValue;
//	            mode = array[i];
//	        }
//	    }
//	    return mode;
//	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int arra[] = new int[n];
      int newarr[] = new int[n];
      int newarra[] = new int[n];
      
      int w = 0;
      int r = 0;
      int z = 0;
      
      for(int arr_i=0; arr_i < n; arr_i++){
        arr[arr_i] = in.nextInt();
      }
      for(int arr_ia=0; arr_ia < n; arr_ia++){
          arra[arr_ia] = in.nextInt();
      } 
      System.arraycopy( arr, 0, newarr, 0, arr.length );
      System.arraycopy( arra, 0, newarra, 0, arra.length );
     
      for(int arr_ia=0; arr_ia < n; arr_ia++){
    	  r = r + (newarr[arr_ia] * newarra[arr_ia]);
    	  w = w + newarra[arr_ia] ;
      }
      System.out.printf("%.1f",((float)r)/w);
      
      System.out.println(w);
	}
    
}