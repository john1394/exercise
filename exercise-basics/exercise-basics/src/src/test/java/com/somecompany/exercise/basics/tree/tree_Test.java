package com.somecompany.exercise.basics.tree;

import java.io.File;

import org.junit.Test;

public class tree_Test {

	@Test
	public void Test1() {
		BinaryTreeBuilder builder = new BinaryTreeBuilder();
		BinaryTree t = builder.BuildFull(5);
		String msg = t.Print();
		System.out.print(msg);

	}

	@Test
	public void Test2() {
		TreeBuilder builder = new TreeBuilder();
		Tree t = builder.buildTree(3, 3);
		String msg = builder.Print(t);
		System.out.print(msg);

	}

	@Test
	public void Test3() {
		TreeBuilder builder = new TreeBuilder();
		File fi = new File("D://testdir");
		Tree t = builder.buildDir(fi);
		String msg = builder.Print(t);
		System.out.print(msg);

	}
}
