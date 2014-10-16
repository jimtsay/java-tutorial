package com.tutorial.tree.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.tutorial.tree.BinaryTree;
import com.tutorial.tree.BinaryTreeNode;

public class TestBinaryTree {

	BinaryTreeNode root;
	
	@Before
	public void setUp() throws Exception {
		//                A
		//             /     \
		//           B         C
		//          /  \     /   \
		//         D    E   F     G
		//             /           \
		//            H             I
		//                           \
		//                            J
		root = new BinaryTreeNode("A");
		root.leftChild = new BinaryTreeNode("B");
		root.rightChild = new BinaryTreeNode("C");
		root.leftChild.leftChild = new BinaryTreeNode("D");
		root.leftChild.rightChild = new BinaryTreeNode("E");
		root.rightChild.leftChild = new BinaryTreeNode("F");
		root.rightChild.rightChild = new BinaryTreeNode("G");
		root.leftChild.rightChild.leftChild = new BinaryTreeNode("H");
		root.rightChild.rightChild.rightChild = new BinaryTreeNode("I");
		root.rightChild.rightChild.rightChild.rightChild = new BinaryTreeNode("J");
	}

	@Test
	public void testGetSize() {
		int actual = BinaryTree.getSize(root);
		int expecting = 10;
		assertEquals("Testing BinaryTree.getSize()", expecting, actual);
	}
	
	@Test
	public void testGetMaxDepth() {
		int actual = BinaryTree.getMaxDepth(root);
		int expecting = 5;
		assertEquals("Testing BinaryTree.getMaxDepth()", expecting, actual);
	}	
	
	@Test
	public void testGetSameLevelNodes() {
		BinaryTreeNode[] actual = BinaryTree.getSameLevelNodes(root, 3);
		BinaryTreeNode[] expecting = new BinaryTreeNode[]{root.leftChild.rightChild.leftChild, root.rightChild.rightChild.rightChild};
		assertArrayEquals("Testing BinaryTree.getSameLevelNodes()", expecting, actual);
	}	

}
