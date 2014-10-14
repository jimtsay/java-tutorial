package com.tutorial.tree;

public class BinaryTree {
	
	public static int getSize(BinaryTreeNode root) {
		if (root == null)
			return 0;

		return 1 + getSize(root.leftChild) + getSize(root.rightChild);
	}
	
	public static int getMaxDepth(BinaryTreeNode root) {
		if (root == null)
			return 0;
		
		int leftCount = getMaxDepth(root.leftChild);
		int rightCount = getMaxDepth(root.rightChild);
		
		if (leftCount > rightCount)
			return 1 + leftCount;
		else
			return 1 + rightCount;
	}	
	
}
