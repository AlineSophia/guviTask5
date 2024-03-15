package com.guvi.task5part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) {
		// To get the input of student
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of student ");
		int total = scan.nextInt();
		// Storing the student names in a list
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= total; i++) {
			System.out.println("Enter student name " + i);
			// Adding the input to a list
			list.add(scan.next());
		}
		System.out.println("\n");
		System.out.println("The students whose name starting with A are");
		// Filtering the student name
		list.stream().filter(s -> s.startsWith("A") || s.startsWith("a")).forEach(System.out::println);
	}

}
