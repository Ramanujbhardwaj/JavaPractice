package com.macys.reader;

import java.util.Scanner;

public class AppleNOranges {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int app = 0;
        int org = 0;
        
        for(int i=0; i < m; i++){
        	int apps = a + apple[i];
        	if(apps >= s && apps <= t){
        		app++;
        	}
        }
        
        for(int i=0; i < n; i++){
        	int orgs = b + orange[i];
        	if(orgs >= s && orgs <= t){
        		org++;
        	}
        }
        
        System.out.println(app );
        System.out.println(org);
    }

}
