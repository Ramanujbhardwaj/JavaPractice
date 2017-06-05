package com.macys.reader;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solutions {
   
//   public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//      int n = scan.nextInt(); 
//      scan.close();
//      String ans="";
//          
//      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
//      if(n%2==1){
//         ans = "Weird";
//      }
//      else{
//         if(n >= 2 && n <= 5){
//        	 ans = "Not Weird";
//         }else if(n > 5 && n <= 20){
//        	 ans = "Weird";
//         }else
//        	 ans = "Not Weird";
//      }
//      System.out.println(ans);
//   }
	
//	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
//        // Complete this function
//		int A = 0;
//		int B = 0;
//		
//		int j = new BigDecimal(a0).compareTo(new BigDecimal(b0));
//		if(j>0)
//			A++;
//		if(j<0)
//			B++;
//		int k = new BigDecimal(a1).compareTo(new BigDecimal(b1));
//		if(k>0)
//			A++;
//		if(k<0)
//			B++;
//		int h = new BigDecimal(a2).compareTo(new BigDecimal(b2));
//		if(h>0)
//			A++;
//		if(h<0)
//			B++;
//		int[] C = {A,B};
//		return C;
//		
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int a0 = in.nextInt();
//        int a1 = in.nextInt();
//        int a2 = in.nextInt();
//        int b0 = in.nextInt();
//        int b1 = in.nextInt();
//        int b2 = in.nextInt();
//        int[] result = solve(a0, a1, a2, b0, b1, b2);
//        String separator = "", delimiter = " ";
//        for (Integer value : result) {
//            System.out.print(separator + value);
//            separator = delimiter;
//        }
//        System.out.println("");
//        
//
//    }
	
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int arr[] = new int[n];
//        Long b = (long) 0;
//        
//        for(int arr_i=0; arr_i < n; arr_i++){
//            arr[arr_i] = in.nextInt();
//            Long a = new Long(arr[arr_i]);
//            b = new BigDecimal(b).add(new BigDecimal(a)).longValue();
//            
//        }
//        System.out.println(b);
//    }
	
	//Diagonal Difference
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a[][] = new int[n][n];
//        for(int a_i=0; a_i < n; a_i++){
//            for(int a_j=0; a_j < n; a_j++){
//                a[a_i][a_j] = in.nextInt();
//            }
//        }
//        
//        int ans[] = {0,0};
//        for(int i=0;i<n; i++){
//        	ans[0]+=a[i][i]; // Reading the first value of first column of diagonal matrix
//        	ans[1]+=a[i][n-1-i]; // Reading the last value of the first column of diagonal matrix.
//        }
//        System.out.println(Math.abs(ans[0]-ans[1]));
//    }
	
	
	//Precision PRoblem
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int arr[] = new int[n];
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//        
//        for(int arr_i=0; arr_i < n; arr_i++){
//            arr[arr_i] = in.nextInt();
//            if (arr[arr_i] < 0){
//            	negative++;
//            }else{
//            	if(arr[arr_i] == 0){
//            		zero++;
//            	}
//            	if(arr[arr_i] > 0){
//            		positive++;
//            	}
//            }
//             
//        }
//        System.out.printf("%.6f",((float)positive)/n);
//        System.out.println();
//        System.out.printf("%.6f",((float)negative)/n);
//        System.out.println();
//        System.out.printf("%.6f",((float)zero)/n);
//        System.out.println();
//    }
	
	//Print Stairs
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        String formatter="%"+n+"s%n";
//        StringBuilder shapes=new StringBuilder();
//        while(n>0){
//        	shapes.append("#");
//        	n--;
//        	System.out.format(formatter,shapes.toString());
//        	
//        }
//    }
	
	//Multiple Line Inputs and printing it on different output.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a [] = new String[n];
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i=0; i<n; i++){
        	a[i] = scan.next();
            a[i] += scan.nextLine();
        }
        String buildeven ="";
        String buildodd = "";
        for(int i=0; i<n; i++){
        	for(int j=0; j<a[i].length(); j++){
        		if(j%2 == 0){
        			buildeven += a[i].charAt(j);
        		}else{
        			buildodd += a[i].charAt(j);
        		}
        			
        	}
        	System.out.println(buildeven + " " + buildodd);
        	buildeven = "";
        	buildodd = "";
        }
        
    }
}
