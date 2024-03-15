package com.guvi.task5part2;

import java.util.Arrays;
import java.util.List;

public class StreamWithList {

	public static void main(String[] args) {
		// Input of list of string
		List<String> list = Arrays.asList("abc", "bc", "efg", "abcd", "", "jkl");
		// Using stream filter to check the list having empty string
		list.stream().filter(s -> !s.isEmpty()).forEach(System.out::println);
	}

}
