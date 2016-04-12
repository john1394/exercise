package com.feinno.exercise.basics.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MergeSortTest {
	@Test
	public void mergeTest() {

		try {
			List<Integer> data = DataA();
			for (int item : data) {
				System.out.println(item);
			}

			System.out.println("After sort:");
			MergeSort t = new MergeSort();
			t.merge(data);

			for (int item : data) {
				System.out.println(item);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void sortAscTest() {

		try {
			List<Integer> data = DataA();
			for (int item : data) {
				System.out.println(item);
			}

			System.out.println("After sort:");
			MergeSort t = new MergeSort();
			t.SortAsc(data, 0, 3, 7);

			for (int item : data) {
				System.out.println(item);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@Test
	public void sortDescTest() {

		try {
			List<Integer> data = DataB();
			for (int item : data) {
				System.out.println(item);
			}

			System.out.println("After sort:");
			MergeSort t = new MergeSort();
			t.Sort(data, 0, 3, 7, false);

			for (int item : data) {
				System.out.println(item);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private List<Integer> DataA() {
		List<Integer> data = new ArrayList<Integer>();
		data.add(2);
		data.add(4);
		data.add(5);
		data.add(7);
		//
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(6);
		return data;
	}

	private List<Integer> DataB() {
		List<Integer> data = new ArrayList<Integer>();
		data.add(7);
		data.add(5);
		data.add(4);
		data.add(2);
		//
		data.add(6);
		data.add(3);
		data.add(2);
		data.add(1);
		return data;
	}

	private List<Integer> Data0() {
		List<Integer> data = new ArrayList<Integer>();
		data.add(2);
		data.add(4);
		data.add(5);
		data.add(7);
		return data;
	}

	private List<Integer> Data1() {
		List<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(6);
		return data;
	}

}
