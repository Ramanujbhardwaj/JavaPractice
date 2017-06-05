package com.macys.reader;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> hash = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            if(phone == 0){
            	phone = 0;
            }
            hash.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hash.containsKey(s)){
            	System.out.println(s+"="+hash.get(s));
            }
        }
        in.close();
    }
}
