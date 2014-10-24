package com.tutorial.string.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tutorial.string.Convert;

public class TestConvert {

	@Test
	public void testAtoi() {
		int actual = Convert.atoi("12345");
		int expecting = 12345;
		assertEquals("Testing atoi", expecting, actual);
	}

	@Test
	public void testItoa() {
		String actual = Convert.itoa(12345);
		String expecting = "12345";
		assertEquals("Testing itoa", expecting, actual);
		actual = Convert.itoa(5);
		expecting = "5";
		assertEquals("Testing itoa", expecting, actual);		
	}	
}
