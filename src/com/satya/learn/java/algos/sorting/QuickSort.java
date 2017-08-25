package com.satya.learn.java.algos.sorting;

import java.util.List;

/**
 * Quick Sort algorithm implementation (divide and conquer):<br/>
 * 1. Partition the list with values lesser than pivot and greater than
 * pivot.<br/>
 * 2. Recursively quick-sort the left and right sublists.<br/>
 * 
 * @author Satyendra Sharma
 *
 */
public class QuickSort<T extends Comparable<? super T>> implements Sort<T> {

	@Override
	public void sort(List<T> list) {
		quickSort(list, 0, list.size() - 1);
	}

	/**
	 * The recursive method to perform quick sort.
	 * 
	 * @param list
	 *            the list to be sorted.
	 * @param start
	 *            the starting position (inclusive).
	 * @param end
	 *            the last position (inclusive).
	 */
	private void quickSort(List<T> list, int start, int end) {
		if (start >= end) {
			return;
		}
		// identify the location for partitioning the list using pivot
		int partitionIndex = partition(list, start, end);

		// left sublist
		quickSort(list, start, partitionIndex - 1);

		// right sublist
		quickSort(list, partitionIndex + 1, end);
	}

	/**
	 * This method performs the partition of list into sublists with values lesser
	 * and greater than the pivot.<br/>
	 * <b>Note:</b> Pivot is considered as the last element of list.
	 * 
	 * @param list
	 *            the list to be partitioned.
	 * @param start
	 *            starting position (inclusive).
	 * @param end
	 *            last position (inclusive).
	 * @return the position of partition with reference to pivot element.
	 */
	private int partition(List<T> list, int start, int end) {
		int partition = start;
		int pivotPos = end;
		T pivot = list.get(pivotPos);
		for (int i = start; i < end; i++) {
			if (list.get(i).compareTo(pivot) <= 0) {
				T temp = list.get(i);
				list.set(i, list.get(partition));
				list.set(partition, temp);
				partition++;
			}
		}
		T temp = list.get(pivotPos);
		list.set(pivotPos, list.get(partition));
		list.set(partition, temp);
		return partition;
	}
}
