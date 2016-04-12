package com.feinno.exercise.basics.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	// A[] A[p...q q+1 ...r]
	public void merge(List<Integer> A) {
		merge(A, 0, A.size() - 1);
	}

	public void merge(List<Integer> A, int p, int r) {
		System.out.println(String.format("Merge \n p:%s,r:%s", p, r));
		if (p < r) {
			// 中间下界
			int q = (p + r) / 2;
			// left 段
			merge(A, p, q);
			// right 段
			merge(A, q + 1, r);
			// L,R 合并排序
			SortAsc(A, p, q, r);
		} else {
			System.out.println(String.format("Merge nothing \n p:%s,r:%s", p, r));
		}
	}

	public void Sort(List<Integer> A, int p, int q, int r, boolean asc) {
		Integer n1 = q - p + 1;
		Integer n2 = r - q;

		// 辅助数组L
		List<Integer> L = new ArrayList<Integer>(n1 + 1);
		// 辅助数组R
		List<Integer> R = new ArrayList<Integer>(n2 + 1);

		for (int i = 0; i < n1; i++) {
			L.add(A.get(p + i));
		}

		// check 结束
		L.add(null);

		for (int i = 0; i < n2; i++) {
			R.add(A.get(q + 1 + i));
		}

		// check 结束
		R.add(null);

		int i = 0;
		int j = 0;

		// r-p+1次
		for (int k = p; k <= r; k++) {
			if (L.get(i) == null) {
				// L结束了,只copy R数据，同时移动R指针
				A.set(k, R.get(j));
				j = j + 1;
				continue;
			}

			if (R.get(j) == null) {
				// R结束了，只copy L数据，同时移动L指针
				A.set(k, L.get(i));
				i = i + 1;
				continue;
			}

			if (asc) {
				// 升序
				if (L.get(i) <= R.get(j)) {
					// L当前项小,则复制L当前项到A,同时移动L指针
					A.set(k, L.get(i));
					i = i + 1;
				} else {
					// R当前项小,则复制R当前项到A,同时移动R指针
					A.set(k, R.get(j));
					j = j + 1;
				}
			} else {
				// 降序
				if (L.get(i) >= R.get(j)) {
					// L当前项大,则复制L当前项到A,同时移动L指针
					A.set(k, L.get(i));
					i = i + 1;
				} else {
					// R当前项大,则复制R当前项到A,同时移动R指针
					A.set(k, R.get(j));
					j = j + 1;
				}
			}
		}
	}

	public void SortAsc(List<Integer> A, int p, int q, int r) {
		System.out.println(String.format("SortAsc \n p:%s,q:%s,r:%s", p, q, r));
		Sort(A, p, q, r, true);
	}

	public void SortDesc(List<Integer> A, int p, int q, int r) {
		Sort(A, p, q, r, false);
	}

}
