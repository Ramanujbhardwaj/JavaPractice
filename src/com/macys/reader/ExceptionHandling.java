package com.macys.reader;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try{
        	System.out.println(Integer.valueOf(S));
        }catch(NumberFormatException e){
        	System.out.println("BadString");
        }
    }
}
