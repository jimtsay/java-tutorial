package com.tutorial.sort.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tutorial.sort.QuickSort;

public class TestQuickSort {

	@Test
	public void testQuickSort() {
		int[] actual = {11, 3, 2, 7, 10, 5, 8, 9};
		QuickSort.sort(actual, 0, actual.length-1);
		int[] expecting = {2, 3, 5, 7, 8, 9, 10, 11};
		assertArrayEquals("Testing QuickSort.sort()", expecting, actual);
	}

}
