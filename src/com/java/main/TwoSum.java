package com.java.main;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int sum = 0;
		int[] output = new int[2];
		for(int i=0; i < nums.length ; i++) {
			for(int j=0 ; j <nums.length; j++) {
				if(i != j && nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
					return output;
				}
			}
		}
		return output;
	}
}
