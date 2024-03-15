package com.guvi.task5part1;

import java.util.stream.Stream;

public class StreamWithString {

	public static void main(String[] args) {
		// Input of string of steams
		Stream<String> names = Stream.of("aBc", "d", "ef");
		// using a map of stream to change to uppercase
		names.map(s -> s.toString().toUpperCase()).forEach(System.out::println);

	}

}
