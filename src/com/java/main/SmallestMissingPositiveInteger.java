package com.java.main;

import java.util.Arrays;

public class SmallestMissingPositiveInteger {
	public static int firstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		
		if(nums[0] > 1) {
			return 1;
		}
		
		for(int i=0; i<nums.length;i++) {
			if(nums[i]>0) {
				if(i>0) {
					if((nums[i] - nums[i-1] != 1)) {
						return nums[i] + 1;	
					}
				}

			}
		}
		return nums[nums.length-1] + 1;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,0};
		System.out.println(firstMissingPositive(nums));
	}
}
