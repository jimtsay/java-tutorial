package com.tutorial.math.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tutorial.math.PrimeNumber;

public class TestPrimeNumber {

	@Test
	public void testIsPrimeNumber() {
		int[] actual = new int[50];
		int index = 0;
		for (int i=1; i<Integer.MAX_VALUE && index < 50; i++) {
			if (PrimeNumber.isPrimeNumber(i)) {
				actual[index++] = i;
			}
		}
		int [] expecting = {
				2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
				31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
				73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 
				127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 
				179, 181, 191, 193, 197, 199, 211, 223, 227, 229 				
		};
		assertArrayEquals("Testing isPrimeNumber()", expecting, actual);
	}
}
