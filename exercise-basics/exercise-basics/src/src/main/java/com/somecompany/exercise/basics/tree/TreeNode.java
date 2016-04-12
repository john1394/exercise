package com.somecompany.exercise.basics.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	private int key;
	private String name;
	private TreeNode parent;
	
	private List<TreeNode> childNodes;
	private String linkPath;

	public List<TreeNode> getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(List<TreeNode> childNodes) {
		this.childNodes = childNodes;
	}

	public synchronized void Add(TreeNode n) {
		if (this.childNodes == null) {
			this.childNodes = new ArrayList<TreeNode>();			
		}
		
		this.childNodes.add(n);
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public String getLinkPath() {
		return linkPath;
	}

	public void setLinkPath(String linkPath) {
		this.linkPath = linkPath;
	}

}
