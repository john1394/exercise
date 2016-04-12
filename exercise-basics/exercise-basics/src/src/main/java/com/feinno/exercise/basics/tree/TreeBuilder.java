package com.feinno.exercise.basics.tree;

import java.io.File;
import java.util.Stack;

public class TreeBuilder {

	// (0)
	// ├─(0|0)
	// │ ├─(0|0|0)
	// │ ├─(0|0|1)
	// │ └─(0|0|2)
	// ├─(0|1)
	// │ ├─(0|1|0)
	// │ ├─(0|1|1)
	// │ └─(0|1|2)
	// └─(0|2)
	// ├─(0|2|0)
	// ├─(0|2|1)
	// └─(0|2|2)

	//dir ->tree
	public Tree buildDir(File fi) {

		if (!fi.exists()) {
			return null;
		}

		Tree t = new Tree();
		TreeNode root = new TreeNode();
		root.setName(fi.getName());
		t.setRoot(root);

		buildDirInner(root, fi);

		return t;
	}

	private void buildDirInner(TreeNode t, File fi) {
		File[] fis = fi.listFiles();
		if (fis != null && fis.length > 0) {
			for (File item : fis) {
				if (item.isDirectory()) {
					
					TreeNode n = new TreeNode();
					n.setName(item.getName());
					t.Add(n);
					n.setParent(t);

					buildDirInner(n, item);
				}
			}
		}
	}

	public Tree buildTree(int highNum, int wideNum) {

		if (highNum <= 0 || wideNum <= 0) {
			return null;
		}

		Tree t = new Tree();

		if (t.getRoot() == null) {
			TreeNode newNode = new TreeNode();
			newNode.setName("0");
			t.setRoot(newNode);
		}

		buildTreeNode(t, t.getRoot(), highNum, wideNum);
		return t;
	}

	private void buildTreeNode(Tree t, TreeNode node, int highNum, int wideNum) {

		int level = highNum - 1;

		if (level <= 0) {
			return;
		}

		for (int i = 0; i < wideNum; i++) {
			TreeNode newNode = new TreeNode();
			String newName = node.getName() + "|" + i;
			newNode.setName(newName);
			node.Add(newNode);
			newNode.setParent(node);
			buildTreeNode(t, newNode, level, wideNum);
		}
	}

	public String Print(Tree t) {

		if (t == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		printNode(t, sb, t.getRoot());
		return sb.toString();
	}

	private String calcParentPath(Tree t, TreeNode node) {

		// root
		if (node.getParent() == null) {
			return getNodeDesc(node);
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode x = node.getParent();
		while (x != null) {
			stack.push(x);
			x = x.getParent();
		}

		StringBuilder sb = new StringBuilder();
		while (stack.size() > 0) {
			TreeNode item = stack.pop();
			// todo
			if (item == t.getRoot()) {
				continue;
			}

			// not root
			if (!isLastNode(item)) {
				sb.append("│  ");
			} else {
				sb.append("    ");
			}
		}

		// leaf node
		if (isLastNode(node)) {
			sb.append("└─");
		} else {
			sb.append("├─");
		}

		sb.append(getNodeDesc(node));
		return sb.toString();
	}

	private void printNode(Tree t, StringBuilder sb, TreeNode node) {

		// not leaf
		if (node.getChildNodes() != null) {

			String path = calcParentPath(t, node);
			sb.append(path);

			for (TreeNode item : node.getChildNodes()) {
				printNode(t, sb, item);
			}

		} else {

			// leaf
			String path = calcParentPath(t, node);
			sb.append(path);
		}

	}

	private String getNodeDesc(TreeNode node) {

		// return "(" + node.getName() + ")" + "\r\n";
		return node.getName() + "\r\n";
	}

	private boolean isLastNode(TreeNode node) {

		// node is root
		if (node.getParent() == null) {
			return true;
		}

		if (node == node.getParent().getChildNodes().get(node.getParent().getChildNodes().size() - 1)) {
			return true;
		} else {
			return false;
		}
	}
}

// private String getIndent(String pat, int num, TreeNode node) {
// StringBuilder sb = new StringBuilder();
// for (int i = 0; i < num - 1; i++) {
// sb.append(pat);
// }
//
// // if (node.getParent() != null && !isLastNode(node.getParent()))
// //
// // {
// // // sb.append("│");
// // }
//
// sb.append(pat);
// return sb.toString();
// }
// /////////////////////////////////////////////////////////
// if (isLastNode(node)) {
// sb.append("└─");
// } else {
// sb.append("├─");
// }
//
// String indent = getIndent("  ", level);
// if (node.getChildNodes() == null) {
// sb.append(indent + getNodeDesc(node));
// } else {
// for (TreeNode item : node.getChildNodes()) {
//
// printNode(sb, item, level + 1);
//
// }
// }