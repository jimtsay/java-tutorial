package com.tutorial.list;

import java.util.List;
import java.util.ListIterator;

public class InsertBetweenItems {
	public static void insertBetweenItems(List<String> list, String itemToBeInserted) {
		ListIterator<String> i = list.listIterator();
		while (i.hasNext()){
			i.next();
			if (i.hasNext()) {
				i.add(itemToBeInserted);
			}
		}
	}
}
