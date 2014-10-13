package com.tutorial.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
	public static String reverseWords(String text) {
		List<String> listString = Arrays.asList(text.split(" "));
		Collections.reverse(listString);
		StringBuffer strBuf = new StringBuffer();
		for (String item: listString) {
			strBuf.append(item);
			strBuf.append(" ");
		}
		if (strBuf.length() > 0) {
			strBuf.setLength(strBuf.length()-1);
		}
		return strBuf.toString();
	}
}
