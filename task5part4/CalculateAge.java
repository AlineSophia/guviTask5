package com.guvi.task5part4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		// Scanner to get the input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Input");
		System.out.println("Enter you birthday yyyy-mm-dd: ");
		String date = scan.next();
		// Splitting the string to get the year month and day seperately
		List arr = Arrays.asList(date.split("-"));
		// Parsing the string to int
		int year = Integer.parseInt(arr.get(0).toString());
		int month = Integer.parseInt(arr.get(1).toString());
		int day = Integer.parseInt(arr.get(2).toString());

		// Getting the date of birth
		LocalDate birthdate = LocalDate.of(year, month, day);
		// Getting the current date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Output");
		// Calculating the year from current date
		int age = Period.between(birthdate, currentDate).getYears();
		// Calculating the months from current date
		int noOfMonth = Period.between(birthdate, currentDate).getMonths();
		// Calculating the days from current date
		int noOfDay = Period.between(birthdate, currentDate).getDays();
		// Printing the final output
		System.out.println("Your age is " + age + " years, " + noOfMonth + " months and " + noOfDay + " days,");

	}

}
