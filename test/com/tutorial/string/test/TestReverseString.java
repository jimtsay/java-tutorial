package com.tutorial.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tutorial.string.ReverseString;

public class TestReverseString {

	@Test
	public void testReverseString() {
		Object actual = ReverseString.reverseString("ABC");
		Object expecting = "CBA";
		assertEquals("Testing reverseString()", expecting, actual);
	}

}
