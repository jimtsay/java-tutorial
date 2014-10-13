package com.tutorial.list.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tutorial.list.InsertBetweenItems;

public class TestInsertBetweenItems {

	@Test
	public void testInsertBetweenItems() {
		List<String> actual = new ArrayList<>(Arrays.asList(new String[]{"This", "is", "a", "test"}));
		InsertBetweenItems.insertBetweenItems(actual, " ");
		List<String> expecting = Arrays.asList(new String[]{"This", " ", "is", " ", "a", " ", "test"});
		assertEquals("Testing insertBetweenItems()", expecting, actual);		
	}

}
