package com.macys.reader;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		System.out.println((x1-x2));
		System.out.println((v2-v1));
		System.out.println((x1-x2)%(v2-v1));
		
		if( v2 > v1 && x2 > x1)
		    System.out.println( "NO");
		else if (x1 > x2 && v1>v2)
			 System.out.println( "NO");
		else if (x1 != x2 && v1 == v2)
			 System.out.println( "NO");
		else if ((x1-x2)%(v2-v1) == 0)
			 System.out.println( "YES");
		else
			System.out.println( "NO");
	}


}
