package com.satya.learn.java.algos.sorting;

import java.util.List;

/**
 * Bubble sort algorithm implementation.<br/>
 * 1. Compare each pair of adjacent elements.<br/>
 * 2. Swap if the adjacent elements are not in order.<br/>
 * 
 * @author Satyendra Sharma
 *
 */
public class BubbleSort<T extends Comparable<? super T>> implements Sort<T> {

	@Override
	public void sort(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			boolean isAnySwapped = false;
			for (int j = 0; j < list.size() - 1; j++) {
				// swap if adjacent element are not in order.
				if (list.get(j).compareTo(list.get(j + 1)) > 0) {
					T temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
					isAnySwapped = true;
				}
			}
			if (!isAnySwapped) {
				break;
			}
		}
	}

}
