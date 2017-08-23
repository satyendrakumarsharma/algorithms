package com.satya.learn.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.satya.learn.java.algos.sorting.MergeSort;
import com.satya.learn.java.algos.sorting.Sort;

public class LearnAlgoDemo {

	public static void main(String[] args) {
		Integer[] elements = new Integer[] { 62, 8, 832, 34, 4, 164, 5, 142, 11, 3, 1, 253, 82, 6, 55, 10, 122, 2, 76,
				23, 5, 533, 15, 28 };
		// { 688, 865, 687, 890, 884, 972, 758, 589, 947, 292, 841, 192, 43,
		// 781, 275, 989, 232, 648, 100, 576, 962, 31, 14, 229, 286, 811, 909,
		// 520, 7, 595, 859, 667, 326, 404, 727, 499, 916, 477, 433, 696, 943,
		// 20, 111, 276, 414, 878, 115, 631, 23, 955, 360, 316, 993 };
		List<Integer> list = new ArrayList<>(Arrays.asList(elements));

		// Sort<Integer> sorting = new SelectionSort<>();
		// Sort<Integer> sorting = new BubbleSort<>();
		// Sort<Integer> sorting = new InsertionSort<>();
		Sort<Integer> sorting = new MergeSort<>();
		sorting.sort(list);
		list.forEach(System.out::println);

	}

	{
		String[] strElements = new String[] { "satya", "hari", "giri", "mukesh", "ruchi", "kavi", "ravi" };
		List<String> strList = new ArrayList<>(Arrays.asList(strElements));
		Sort<String> strSort = new MergeSort<>();
		strSort.sort(strList);
		strList.forEach(System.out::println);
	}

}
