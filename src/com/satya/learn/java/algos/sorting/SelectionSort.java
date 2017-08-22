package com.satya.learn.java.algos.sorting;

import java.util.List;

/**
 * Selection sort algorithm implementation.<br/>
 * 1. Identify the minimum element in unsorted sublist.<br/>
 * 2. Swap the first element from unsorted sublist with the minimum element<br/>
 * 
 * @author Satyendra Sharma
 *
 */
public class SelectionSort<T extends Comparable<? super T>> implements Sort<T> {

	public void sort(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			int minIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				// identify the minimum in unsorted sublist.
				if (list.get(j).compareTo(list.get(minIndex)) < 0) {
					minIndex = j;
				}
			}
			// swap the minimum element with first element form unsorted sublist.
			T temp = list.get(minIndex);
			list.set(minIndex, list.get(i));
			list.set(i, temp);
		}
	}

}
