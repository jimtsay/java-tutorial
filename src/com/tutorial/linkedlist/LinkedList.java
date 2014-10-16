package com.tutorial.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	
	public static String[] linkedListToArray(LinkedListNode head) {
		List<String> list = new ArrayList<String>();
		while (head != null) {
			list.add(head.name);
			head = head.next;
		}
		return list.toArray(new String[list.size()]);
	}
	
	public static LinkedListNode reverseLinkedList(LinkedListNode head, LinkedListNode prev) {
		if (head == null)
			return prev;
		
		LinkedListNode next = head.next;
		head.next = prev;
		return reverseLinkedList(next, head);
	}
	
	public static LinkedListNode findMiddle(LinkedListNode head) {
		if (head == null)
			return null;
		
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		while (slow.next != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}	
}
