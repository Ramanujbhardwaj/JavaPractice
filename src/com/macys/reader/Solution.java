package com.macys.reader;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
//    public static void main(String[] args) {
////        int i = 4;
////        double d = 4.0;
////        String s = "HackerRank ";
////		
////        Scanner scan = new Scanner(System.in);
////        int a= 0;
////        double b = 0.0;
////        a = scan.nextInt();
////        b = scan.nextDouble();
////        String c = scan.next();
////        c += scan.nextLine();
////        System.out.println(i+a);
////        System.out.println(d+b);
////        System.out.println(s.concat(c));
////        scan.close();
//    	
////    	 Scanner scan = new Scanner(System.in);
////    	    int i = scan.nextInt();
////    	    double d = scan.nextDouble();
////    	    scan.nextLine();
////    	    String s = scan.nextLine();
////
////    	    // Write your code here.
////
////    	    System.out.println("String: " + s);
////    	    System.out.println("Double: " + d);
////    	    System.out.println("Int: " + i);
//    	
//    	
////    	Scanner sc=new Scanner(System.in);
////        System.out.println("================================");
////        for(int i=0;i<3;i++){
////            String s1=sc.next();
////            int x=sc.nextInt();
////            String formatted = String.format("%03d", x);
////            System.out.printf("\n%-14s %3s", s1, formatted);
////            System.out.println();
////        }
////        System.out.println("================================");
//    	
//    	Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        for(int i=1; i<=10; i++){
//            System.out.println(N + " x " + i + " = " + new BigDecimal(N).multiply(new BigDecimal(i)));
//        }
//    }
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}