package com.tutorial.math;

public class PrimeNumber {
	public static boolean isPrimeNumber(int number) {
		if (number == 2)
			return true;
		if (number < 2 || number % 2 == 0)
			return false;
		int sqrt = (int)Math.sqrt(number);
		for (int i = 3; i <= sqrt; i+=2) { 
			if (number%i == 0)
				return false;
		}
		return true;
	}
}
