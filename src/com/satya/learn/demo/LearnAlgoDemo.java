package com.satya.learn.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.satya.learn.java.algos.sorting.InsertionSort;
import com.satya.learn.java.algos.sorting.Sort;

public class LearnAlgoDemo {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 8, 4, 5, 3, 1, 6, 2 };
		List<Integer> list = new ArrayList<>(Arrays.asList(elements));

		// Sort<Integer> sorting = new SelectionSort<>();
		// Sort<Integer> sorting = new BubbleSort<>();
		Sort<Integer> sorting = new InsertionSort<>();
		sorting.sort(list);
		list.forEach(System.out::println);
	}

}
