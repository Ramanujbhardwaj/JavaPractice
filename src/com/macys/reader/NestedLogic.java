package com.macys.reader;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NestedLogic {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		String actual = scan.nextLine();
		String received = scan.nextLine();
		scan.close();
		
		String df = ("dd MM yyyy");
		Date actualDate = new SimpleDateFormat(df).parse(actual);
		Date receivedDate = new SimpleDateFormat(df).parse(received);
		Calendar actualCalendarDate = Calendar.getInstance();
		actualCalendarDate.setTime(actualDate);
	
		Calendar receivedCalendarDate = Calendar.getInstance();
		receivedCalendarDate.setTime(receivedDate);
		
		validDate(receivedCalendarDate, actualCalendarDate);
		
	}
	
	public static void validDate(Calendar received, Calendar actual){

		int yearDiff = actual.get(Calendar.YEAR) - received.get(Calendar.YEAR);
		int monthDiff = actual.get(Calendar.MONTH) - received.get(Calendar.MONTH);
		int dayDiff = actual.get(Calendar.DAY_OF_MONTH) - received.get(Calendar.DAY_OF_MONTH);

		if(yearDiff > 0){
			System.out.println(10000);
		}else if(monthDiff > 0 && yearDiff == 0){
			System.out.println (monthDiff * 500);
		}else if (dayDiff > 0 && yearDiff == 0 ){
			System.out.println( dayDiff  * 15);
		}else{
			System.out.println(0);
		}


	}
		


}
