package com.tutorial.string;

public class StringCheck {
	public static boolean IsPalindrome(String text) {
		char[] charArray = text.toCharArray();
		int head = 0;
		int tail = charArray.length - 1;
		while (head < tail && charArray[head] == charArray[tail]) {
			head++;
			tail--;
		}
		return head >= tail;	
	}
	
	public static boolean IsPalindrome(char[] charArray, int head, int tail) {
		if (head >= tail)
			return true;
		else if (charArray[head] != charArray[tail])
			return false;
		else
			return IsPalindrome(charArray, head+1, tail-1);
	}

	public static boolean IsPalindromeRecursive(String text) {
		char[] charArray = text.toCharArray();
		return IsPalindrome(charArray, 0, charArray.length-1);
	}
}
