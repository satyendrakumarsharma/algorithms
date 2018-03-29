package com.satya.learn.java.algos.sorting;

import java.util.List;

/**
 * Sort Algorithm.
 * 
 * @author Satyendra Sharma
 *
 */
public interface Sort<T> {

	/**
	 * This method sorts the given list using the algorithm implemented in
	 * concrete implementation.
	 * 
	 * @param list
	 *            the list to be sorted.
	 */
	public void sort(List<T> list);

	/**
	 * This method sorts the given array using the algorithm implemented in
	 * concrete implementation.
	 * 
	 * @param arr
	 *            the array to be sorted.
	 */
	public default void sort(T[] arr) {
		// empty default method for backward compatibility
	}

}
