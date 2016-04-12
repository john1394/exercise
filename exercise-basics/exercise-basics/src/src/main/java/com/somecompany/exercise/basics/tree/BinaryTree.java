package com.somecompany.exercise.basics.tree;

public class BinaryTree extends Tree {

	private BinaryTreeNode root;

	public String Print() {

		if (root == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		String result = sb.toString();
		return result;

	}

	public void Insert(int key) {
		if (root == null) {
			root = new BinaryTreeNode();
			root.setKey(key);
			root.setName("n"+key);
			return;
		}

		BinaryTreeNode y = this.root;
		BinaryTreeNode x = y;

		while (y != null) {
			if (key < y.getKey()) {
				x = y;
				y = y.getLeft();
				
			} else if (key > y.getKey()) {
				x = y;
				y = y.getRight();
				
			} else {
				//
				break;
			}
		}

		BinaryTreeNode newNode = new BinaryTreeNode();
		newNode.setKey(key);
		newNode.setName("n"+key);
		
		if (key < x.getKey()) {
			x.setLeft(newNode);
		} else if (key > x.getKey()) {
			x.setRight(newNode);
		} else {
			//
		}

	}

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

}
