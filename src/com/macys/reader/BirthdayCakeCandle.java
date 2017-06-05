package com.macys.reader;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandle {

//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int height[] = new int[n];
//        for(int height_i=0; height_i < n; height_i++){
//            height[height_i] = in.nextInt();
//        }
//        Arrays.sort(height,0,n);
//        int i = 1;
//        int h = height[n-1];
////        for(int j=n-1; j > 0; --j){
////        	if(h == height[j]){
////        		i++;
////        	}
////        }
//        for(int j=n-1; j > 0; --j){
//        	if(height[n] == height[j]){
//        		++i;
//        	}
//        }
//        System.out.println(i);
//    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		for(int height_i=0; height_i < n; height_i++){
			height[height_i] = in.nextInt();
		}
		Arrays.sort(height,0,n);
		int i = 1;
		for(int j=0; j > n-1; j++){
			if(height[n-1] == height[j]){
				++i;
			}
		}
		System.out.println(i);
	}
}
