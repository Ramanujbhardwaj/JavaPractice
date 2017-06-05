package com.macys.reader;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		if (time.equalsIgnoreCase("12:00:00AM"))
			System.out.println("00:00:00");
		else if(time.equalsIgnoreCase("12:00:00PM"))
			System.out.println("12:00:00");
		else {
			String hour = time.substring(0, 2);
			String minutes = time.substring(3, 5);
			String seconds = time.substring(6, 8);
			String AMPM = time.substring(8, 10);
			String delimiter = ":";
			String newhours = "";
			if (AMPM.equalsIgnoreCase("PM")) {
				if(hour.equalsIgnoreCase("12")){
					newhours = hour;
				}
				else{
					int hours = Integer.valueOf(hour);
					hours = hours + 12;
	
					newhours = (String.valueOf(hours));
				}
			} else {
				newhours = hour;
			}

			System.out.println(newhours + delimiter + minutes + delimiter + seconds);
		}
	}
	

	
}