package com.tutorial.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tutorial.string.StringCheck;

public class TestStringCheck {

	@Test
	public void testIsPalindrome() {
		String text = "RACECAR";
		boolean actual = StringCheck.IsPalindrome(text);
		boolean expecting = true;
		assertEquals("Testing IsPalindrome", expecting, actual);
		text = "RACCAR";
		actual = StringCheck.IsPalindrome(text);
		expecting = true;
		assertEquals("Testing IsPalindrome", expecting, actual);	
		text = "RACECBR";
		actual = StringCheck.IsPalindrome(text);
		expecting = false;
		assertEquals("Testing IsPalindrome", expecting, actual);				
	}

	@Test
	public void testIsPalindromeRecursive() {
		String text = "RACECAR";
		boolean actual = StringCheck.IsPalindromeRecursive(text);
		boolean expecting = true;
		assertEquals("Testing IsPalindromeRecursive", expecting, actual);
		text = "RACCAR";
		actual = StringCheck.IsPalindromeRecursive(text);
		expecting = true;
		assertEquals("Testing IsPalindromeRecursive", expecting, actual);
		text = "RACCBR";
		actual = StringCheck.IsPalindromeRecursive(text);
		expecting = false;
		assertEquals("Testing IsPalindromeRecursive", expecting, actual);		
	}	
}
