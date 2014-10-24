package com.tutorial.string;

public class Convert {
	
	public static int atoi(String text) {
		char[] charArray = text.toCharArray();
		int result = 0;
		for (char c : charArray) {
			result = result*10 + (c - '0');
		}
		return result;
	}
	
	public static String itoa(int number) {
		String result = "";
		do {
			result = (char)('0' + number % 10) + result;
		} while ((number = number/10) > 0);
		return result;
	}
	
}
