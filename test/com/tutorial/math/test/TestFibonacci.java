package com.tutorial.math.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tutorial.math.Fibonacci;

public class TestFibonacci {
	@Test
	public void testFibonacciRecursive() {
		int actual = Fibonacci.fibonacciRecusive(10);
		int expecting = 55;
		assertEquals("Testing fibonacciRecusive()", expecting, actual);
	}
	
	@Test
	public void testFibonacciTailRecursive() {
		int actual = Fibonacci.fibonacciTailRecusive(10, 1, 0);
		int expecting = 55;
		assertEquals("Testing fibonacciTailRecusive()", expecting, actual);
	}
	
	@Test
	public void testFibonacciIterative() {
		int actual = Fibonacci.fibonacciIterative(10);
		int expecting = 55;
		assertEquals("Testing fibonacciIterative()", expecting, actual);
	}		
}
