package com.satya.learn.java.algos.sorting;

import java.util.List;

/**
 * Insertion Sort algorithm implementation:<br/>
 * 1. Keep shifting the start point of unsorted sublist.<br/>
 * 2. Keep swapping till the location for insertion is reached in sorted
 * sublist.<br/>
 * 
 * @author Satyendra Sharma
 *
 */
public class InsertionSort<T extends Comparable<? super T>> implements Sort<T> {

	@Override
	public void sort(List<T> list) {
		for (int unsortedPos = 1; unsortedPos < list.size(); unsortedPos++) {
			for (int insertPos = unsortedPos; insertPos > 0
					&& list.get(insertPos).compareTo(list.get(insertPos - 1)) < 0; insertPos--) {
				// keep swapping till the location for insertion is reached.
				T temp = list.get(insertPos);
				list.set(insertPos, list.get(insertPos - 1));
				list.set(insertPos - 1, temp);
			}
		}
	}

}
