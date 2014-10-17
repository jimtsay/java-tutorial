package com.tutorial.linkedlist.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tutorial.linkedlist.LinkedList;
import com.tutorial.linkedlist.LinkedListNode;

public class TestLinkedList {

	LinkedListNode head;
	
	@Before
	public void setUp() throws Exception {
		head = new LinkedListNode("A");
		head.next = new LinkedListNode("B");
		head.next.next = new LinkedListNode("C");
		head.next.next.next = new LinkedListNode("D");
		head.next.next.next.next = new LinkedListNode("E");
		head.next.next.next.next.next = new LinkedListNode("F");
		head.next.next.next.next.next.next = new LinkedListNode("G");
	}

	@Test
	public void testReverseLinkedList() {
		String[] actual = LinkedList.linkedListToArray(LinkedList.reverseLinkedList(head, null));
		String[] expecting = {"G", "F", "E", "D", "C", "B", "A"};
		assertArrayEquals("Testing reverseLinkedList()", expecting, actual);
	}
	
	@Test
	public void testFindMiddle() {
		String actual = LinkedList.findMiddle(head).name;
		String expecting = "D";
		assertEquals("Testing findMiddle()", expecting, actual);
	}	

	@Test
	public void testFindLoopNoLoop() {
		Boolean actual = LinkedList.findLoop(head);
		Boolean expecting = false;
		assertEquals("Testing findLoop()", expecting, actual);
	}
	
	@Test
	public void testFindLoop() {
		head.next.next.next.next.next.next.next = head.next;
		Boolean actual = LinkedList.findLoop(head);
		Boolean expecting = true;
		assertEquals("Testing findLoop()", expecting, actual);
	}	
}
