package com.somecompany.exercise.basics.sort;

import java.util.List;

public class SelectionSort {

	//升序
	public void sortAsc(List<Integer> data) {

		if (data == null || data.size() == 0) {
			return;
		}

		int N=data.size();
		for (int i = 0; i < N - 1; i++) {
			// N-1 趟
			int index = i;// 最小的数的index

			// N-1-i 次
			for (int j = i + 1; j < N; j++) {
				if (data.get(j) < data.get(index)) {
					index = j;
				}
			}

			if (index > i) {
				// 交换 index,j
				int temp = data.get(i);
				data.set(i, data.get(index));
				data.set(index, temp);
			}
		}

	}
	
	//倒排
	public void sortDesc(List<Integer> data) {

		if (data == null || data.size() == 0) {
			return;
		}

		int N=data.size();
		for (int i = 0; i < N - 1; i++) {
			// N-1 趟
			int index = i;// 最大的数的index

			// N-1-i 次
			for (int j = i + 1; j < N; j++) {
				if (data.get(j) > data.get(index)) {
					index = j;
				}
			}

			if (index > i) {
				// 交换 index,j
				int temp = data.get(i);
				data.set(i, data.get(index));
				data.set(index, temp);
			}
		}

	}
}
