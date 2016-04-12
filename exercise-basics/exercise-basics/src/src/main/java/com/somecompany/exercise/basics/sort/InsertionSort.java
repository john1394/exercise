package com.somecompany.exercise.basics.sort;

import java.util.List;

public class InsertionSort {

	public void Sort(List<Integer> data) {

		if (data == null) {
			return;
		}

		int length = data.size();

		for (int j = 1; j < length; j++) {
			int i = j - 1;
			int key = data.get(j);
			while (i > -1 && data.get(i) > key) {
				data.set(i + 1, data.get(i));
				i = i - 1;
			}

			data.set(i + 1, key);
		}

	}

	public void SortDesc(List<Integer> data) {
		if (data == null) {
			return;
		}

		int length = data.size();
		for (int j = 1; j < length; j++) {
			int i = j - 1;
			int key = data.get(j);
			while (i > -1 && data.get(i) < key) {
				data.set(i + 1, data.get(i));
				i = i - 1;
			}

			data.set(i + 1, key);
		}

	}

}
