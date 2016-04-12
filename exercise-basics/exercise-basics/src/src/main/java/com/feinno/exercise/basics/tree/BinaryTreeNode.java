package com.feinno.exercise.basics.tree;

public class BinaryTreeNode extends TreeNode {

	private String name;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	private int key;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}


	
	
	
}
