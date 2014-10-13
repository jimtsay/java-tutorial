package com.tutorial.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tutorial.string.ReverseWords;

public class TestReverseWords {

	@Test
	public void testReverseWords() {
		Object actual = ReverseWords.reverseWords("This is a test");
		Object expecting = "test a is This";
		assertEquals("Testing reverseWords()", expecting, actual);
	}

}
