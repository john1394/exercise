package com.somecompany.exercise.basics.sort;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void SortDescTest() {

		List<Integer> data = Data1();
		for (int item : data) {
			System.out.println(item);
		}

		System.out.println("After sort:\n");
		SelectionSort t = new SelectionSort();
		t.sortDesc(data);

		for (int item : data) {
			System.out.println(item);
		}

	}

	@Test
	public void SortAscTest() {

		List<Integer> data = Data1();
		for (int item : data) {
			System.out.println(item);
		}

		System.out.println("After sort:\n");
		SelectionSort t = new SelectionSort();
		t.sortAsc(data);

		for (int item : data) {
			System.out.println(item);
		}

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

}
