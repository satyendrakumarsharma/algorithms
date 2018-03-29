package com.satya.learn.java.algos.sorting;

import java.util.LinkedList;
import java.util.List;

/**
 * Merge Sort algorithm implementation (divide and conquer):<br/>
 * 1. Split the list at mid into unsorted sublists, until each sublist has just
 * one element.<br/>
 * 2. Merge all the sublists so that the merged sublists are sorted.<br/>
 * 
 * @author Satyendra Sharma
 *
 */
public class MergeSort<T extends Comparable<? super T>> implements Sort<T> {

	@Override
	public void sort(List<T> list) {
		mergeSort(list, 0, list.size() - 1);
	}

	@Override
	public void sort(T[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	/**
	 * The recursive method to perform merge sort on {@code List}.
	 * 
	 * @param list
	 *            the list to be sorted.
	 * @param start
	 *            the starting position (inclusive).
	 * @param end
	 *            the last position (inclusive).
	 */
	private void mergeSort(List<T> list, int start, int end) {
		if (start >= end) {
			return;
		}

		int mid = (start + end) / 2;

		// left sublist.
		mergeSort(list, start, mid);

		// right sublist.
		mergeSort(list, mid + 1, end);

		// merge left and right.
		merge(list, start, mid, end);
	}

	/**
	 * The recursive method to perform merge sort on array.
	 * 
	 * @param arr
	 *            the array to be sorted
	 * @param start
	 *            the starting position (inclusive) of array
	 * @param end
	 *            the last position (inclusive) of array
	 */
	private void mergeSort(T[] arr, int start, int end) {
		if (start >= end) {
			return;
		}

		int mid = (start + end) / 2;

		// left sub-array
		mergeSort(arr, start, mid);

		// right sub-array
		mergeSort(arr, mid + 1, end);

		// merge left and right sub-arrays
		merge(arr, start, mid, end);
	}

	/**
	 * This method merges the sublists in the sorted order, based on the given
	 * position details.
	 * 
	 * @param list
	 *            the list to be merged.
	 * @param left
	 *            starting position (inclusive).
	 * @param mid
	 *            middle position (moves in left sublist).
	 * @param end
	 *            last position (inclusive).
	 */
	private void merge(List<T> list, int left, int mid, int end) {
		List<T> listLeft = new LinkedList<>();
		List<T> listRight = new LinkedList<>();
		
		for (int i = left; i <= mid; i++) {
			listLeft.add(list.get(i));
		}
		for (int i = mid + 1; i <= end; i++) {
			listRight.add(list.get(i));
		}

		int mergePos = left;
		int leftPos = 0;
		int rightPos = 0;

		while (mergePos <= end) {
			if (leftPos < listLeft.size() && (rightPos >= listRight.size()
					|| listLeft.get(leftPos).compareTo(listRight.get(rightPos)) <= 0)) {
				list.set(mergePos, listLeft.get(leftPos++));
			} else if (rightPos < listRight.size()
					&& (leftPos >= listLeft.size() || listLeft.get(leftPos).compareTo(listRight.get(rightPos)) > 0)) {
				list.set(mergePos, listRight.get(rightPos++));
			}
			mergePos++;
		}
	}

	/**
	 * This method merges the sub-arrays in a sorted order, based on the given
	 * position details.
	 * 
	 * @param arr
	 *            the sub-array to be merged
	 * @param start
	 *            starting position (inclusive)
	 * @param mid
	 *            middle position (moves in left sub-array)
	 * @param end
	 *            last position (inclusive)
	 */
	@SuppressWarnings("unchecked")
	private void merge(T[] arr, int start, int mid, int end) {
		int sizeLeft = mid - start + 1;
		int sizeRight = end - mid;

		Object[] arrLeft = new Object[sizeLeft];
		Object[] arrRight = new Object[sizeRight];

		for (int pos = 0, i = start; i <= mid; i++) {
			arrLeft[pos++] = arr[i];
		}
		for (int pos = 0, i = mid + 1; i <= end; i++) {
			arrRight[pos++] = arr[i];
		}

		int posLeft = 0;
		int posRight = 0;
		int pos = start;

		while (pos <= end) {
			if (posLeft < sizeLeft && (posRight >= sizeRight
					|| (((Comparable<? super T>) arrLeft[posLeft]).compareTo((T) arrRight[posRight]) < 0))) {
				arr[pos++] = (T) arrLeft[posLeft++];
			} else if (posRight < sizeRight && (posLeft >= sizeLeft
					|| (((Comparable<? super T>) arrLeft[posLeft]).compareTo((T) arrRight[posRight]) >= 0))) {
				arr[pos++] = (T) arrRight[posRight++];
			}
		}
	}

}