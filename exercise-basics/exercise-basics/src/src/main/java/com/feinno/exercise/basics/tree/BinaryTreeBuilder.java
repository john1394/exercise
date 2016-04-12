package com.feinno.exercise.basics.tree;

public class BinaryTreeBuilder {

	public BinaryTree BuildFull(int num) {
		BinaryTree tr = new BinaryTree();

		// BinaryTreeNode rootNode=new BinaryTreeNode();
		// rootNode.setName("rootnode");
		// tr.setRoot(rootNode);

		for (Integer i = 0; i < num; i++) {
			tr.Insert(i);
		}

		return tr;
	}

	// public BinaryTree BuildRandom(Integer num) {
	// BinaryTree tr = new BinaryTree();
	// Random rand = new Random();
	// int val = rand.nextInt(num);
	// tr.Insert(val);
	// return null;
	// }
}
