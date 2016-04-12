package com.feinno.exercise.basics.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void Test1() {

		List<Integer> data = Data1();
		for (int item : data) {
			System.out.println(item);
		}

		System.out.println("After sort:");
		InsertionSort t = new InsertionSort();
		t.Sort(data);

		for (int item : data) {
			System.out.println(item);
		}

	}

	// 2.1.1
	@Test
	public void Test1_1() {

		List<Integer> data = Data2();
		for (int item : data) {
			System.out.println(item);
		}

		System.out.println("After sort:");
		InsertionSort t = new InsertionSort();
		t.Sort(data);

		for (int item : data) {
			System.out.println(item);
		}

	}

	// 2.1.2
	@Test
	public void Test2() {

		List<Integer> data = Data1();
		for (int item : data) {
			System.out.println(item);
		}

		System.out.println("After sort:");
		InsertionSort t = new InsertionSort();
		t.SortDesc(data);

		for (int item : data) {
			System.out.println(item);
		}
	}

	@Test
	public void Test3() {
		Test3_1();
	}

	//2.1.4
	@Test
	public void Test4() {

		int[] A = { 0, 1, 1 };
		int[] B = { 1, 1, 1 };
		int[] C = BinAdd(A, B, 3);

		System.out.println(C);
	}

	private int[] BinAdd(int[] A, int[] B, int N) {

		int[] result = new int[N + 1];
		for (int i = 0; i < N; i++) {
			result[i + 1] = A[i] + B[i];
		}

		for (int i = N; i > -1; i--) {
			if (result[i] >= 2) {
				result[i] -= 2;
				result[i - 1] += 1;
			}

		}

		return result;

	}

	public Integer Test3_1() {
		int N = 3;
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			arr.add(i);
		}

		int val = 2;

		for (int i = 0; i < N; i++) {
			if (arr.get(i) == val) {
				return i;
			}
		}

		// i==0 时

		return null;
	}

	private List<Integer> Data0() {
		List<Integer> data = new ArrayList<Integer>();
		// data.add(5);

		return data;
	}

	private List<Integer> Data1() {
		List<Integer> data = new ArrayList<Integer>();
		data.add(5);
		data.add(2);
		data.add(4);
		data.add(6);
		data.add(1);
		data.add(3);
		return data;
	}

	private List<Integer> Data2() {
		List<Integer> data = new ArrayList<Integer>();
		data.add(31);
		data.add(41);
		data.add(59);
		data.add(26);
		data.add(41);
		data.add(58);
		return data;
	}

}
