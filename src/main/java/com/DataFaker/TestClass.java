package com.DataFaker;

import java.util.Date;

import org.fluttercode.datafactory.impl.DataFactory;

public class TestClass {

	public static void main(String[] args) {
		DataFactory df = new DataFactory();
		for (int i = 0; i < 100; i++) {
			String name = df.getFirstName() + " " + df.getLastName();
			System.out.println(name);
		}
		
		for (int i = 0; i < 100; i++) {
			String address = df.getAddress()+","+df.getCity()+","+df.getNumberText(5);
			String business = df.getBusinessName();
			System.out.println(business + " located at " + address);
		}
		
		
		// Date
		Date minDate = df.getDate(2000, 1, 1);
		Date maxDate = new Date();
		for (int i = 0; i < 10; i++) {
			Date start = df.getDateBetween(minDate, maxDate);
			System.out.println("Date = "+start);
		}
		
		// Random Numbers
		System.out.println(df.getRandomText(20, 25));
		System.out.println(df.getRandomChars(20));
		System.out.println(df.getRandomWord(4, 10));
	}
}
