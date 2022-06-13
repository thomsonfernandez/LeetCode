package com.java.main;

import java.util.Arrays;

public class MedianSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int fal = nums1.length;        //determines length of firstArray  
		int sal = nums2.length;   //determines length of secondArray  
		int[] result = new int[fal + sal];  //resultant array of size first array and second array  
		System.arraycopy(nums1, 0, result, 0, fal);  
		System.arraycopy(nums2, 0, result, fal, sal);  
		double median = 0.0;
		Arrays.sort(result);
		int totalLength = result.length;
		double val1 = result[totalLength/2];
		if(totalLength % 2 == 1) {
			median = val1;
		}else {
			double val2 = result[(totalLength/2) - 1];
			median = (val1+ val2) / 2;
		}
		return median;
	}

	/*public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0.0;
		if(median(nums1) == 0.0 || median(nums2) == 0.0) {
			median = median(nums1) + median(nums2);
		}else {
			median = (median(nums1) + median(nums2))/2;
		}
		 
		return median;
		
		
	}

	public static double median(int[] result) {
		double median = 0.0;
		int totalLength = result.length;
		if(totalLength != 0) {
			double val1 = result[totalLength/2];
			if(totalLength % 2 == 1) {
				median = val1;
			}else {
				double val2 = result[(totalLength/2) - 1];
				median = (val1+ val2) / 2;
			}
		}
		
		return median;
		
	}*/
	
	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		findMedianSortedArrays( nums1, nums2) ;
	}
}
