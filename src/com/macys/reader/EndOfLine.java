package com.macys.reader;

import java.util.Scanner;

public class EndOfLine {

	
	public static void main(String[] arg){
		
		 Scanner sc = new Scanner(System.in);
		 int j= 0;
		 while(sc.hasNext()){
			 System.out.println(j + " " + sc.nextLine());
			 j++;
		 }
	}
}
