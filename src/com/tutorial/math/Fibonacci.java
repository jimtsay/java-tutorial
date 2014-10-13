package com.tutorial.math;

public class Fibonacci {
	public static int fibonacciRecusive(int number) {
		if (number <= 1) {
			return number;
		}
		return fibonacciRecusive(number - 1) + fibonacciRecusive(number - 2);
	}
	
	public static int fibonacciTailRecusive(int number, int next, int current) {
		if (number == 0) {
			return current;
		}
		return fibonacciTailRecusive(number - 1, next + current, next);
	}	
	
	public static int fibonacciIterative(int number) {
		if (number <= 1) {
			return number;
		} else {
			int prev = 0;
			int current = 1;
			int next = 0;
			for (int i = 2; i <= number; i++) {
				next = prev + current;
				prev = current;
				current = next;
			}
			return next;
		}
	}	
}
