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
	
	public static BinaryTreeNode[] getSameLevelNodes(BinaryTreeNode root, int level) {
		if (root == null)
			return new BinaryTreeNode[0];
		
		if (level == 0)
			return new BinaryTreeNode[]{root};
		else {
			level--;
			BinaryTreeNode[] fromLeftChild;
			BinaryTreeNode[] fromRighttChild;
			if (root.leftChild != null)
				fromLeftChild = getSameLevelNodes(root.leftChild, level);
			else
				fromLeftChild = new BinaryTreeNode[0];
			
			if (root.rightChild != null)
				fromRighttChild = getSameLevelNodes(root.rightChild, level);
			else
				fromRighttChild = new BinaryTreeNode[0];
			
			BinaryTreeNode[] combined = new BinaryTreeNode[fromLeftChild.length + fromRighttChild.length];
			System.arraycopy(fromLeftChild, 0, combined, 0, fromLeftChild.length);
			System.arraycopy(fromRighttChild, 0, combined, fromLeftChild.length, fromRighttChild.length);
			return combined;	
		}
	}
}
