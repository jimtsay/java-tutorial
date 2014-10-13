package com.tutorial.string;

public class ReverseString {
	public static String reverseString(String text) {
		StringBuffer strBuffer = new StringBuffer(text);
		return strBuffer.reverse().toString();
	}
}
