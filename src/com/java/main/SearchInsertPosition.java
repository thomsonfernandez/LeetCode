package com.java.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.*/

public class SearchInsertPosition {


	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 12 }; 
		int target = 13;

	/*	List<int[]> arrList = Arrays.asList(arr); 
		if(arrList.contains(target)) {

			System.out.println(arrList.indexOf(target)); 
		}else { 
			arrList.addAll(target);
			Collections.sort(arrList); 
			System.out.println(arrList.indexOf(target));
		}*/

		int a = Arrays.binarySearch(arr, target); 
		if(a>=0) {
			System.out.println(a);
		}else {
			System.out.println(-(a+1));
		}
		


	}


	/*static int binarySearch(int[] a, int target) {
		int l = 0, r = a.length - 1, mid, ans = -1;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (a[mid] == target)
				return mid;
			if (a[mid] < target) {
				l = mid + 1;
				ans = mid + 1;
			} else {
				ans = mid;
				r = mid - 1;
			}
		}
		return ans;
	}

	static int searchInsert(int[] a, int target) {
		return binarySearch(a, target);
	}

	public static void main(String args[]) {
		int a[] = { 1, 3, 5, 7, 9 }, target = 8;
		System.out.println(searchInsert(a, target));
	}*/
}
