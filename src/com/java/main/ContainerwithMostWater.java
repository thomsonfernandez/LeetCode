package com.java.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ContainerwithMostWater {
	/*
	 * public static int maxArea(int[] height) { List<Integer> list = Arrays.stream(
	 * height ).boxed().collect( Collectors.toList() ); HashMap<String, Integer> map
	 * = new HashMap<String, Integer>(); for(int i=0; i<list.size(); i++) { for(int
	 * j=i+1; j<list.size();j++) { int maxmmmm = Math.min(list.get(i), list.get(j));
	 * map.put(i+"_"+j, maxmmmm * (j-i)); } } Integer value =
	 * Collections.max(list,null); int index = list.indexOf(value); return value *
	 * index; Map.Entry<String, Integer> maxEntry = null; for (Map.Entry<String,
	 * Integer> entry : map.entrySet()) { if (maxEntry == null ||
	 * entry.getValue().compareTo(maxEntry.getValue()) > 0) { maxEntry = entry; } }
	 * System.out.println("maxEntry : "+maxEntry);
	 * 
	 * String resp = maxEntry.getKey(); String split[] = resp.split("_"); // int
	 * output = list.get(Integer.parseInt(split[0])) *
	 * list.get(Integer.parseInt(split[0])); int val =
	 * Math.min(list.get(Integer.parseInt(split[0])),
	 * list.get(Integer.parseInt(split[1]))); int diff = Integer.parseInt(split[1])
	 * - Integer.parseInt(split[0]); System.out.println("val : "+val);
	 * System.out.println("diff : "+diff);
	 * 
	 * return maxEntry.getValue(); }
	 */

	public static int maxArea(int[] height) {
		int maxarea = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			int width = right - left;
			maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * width);
			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxarea;
	}

	public static void main(String args[]) {
		int[] val = { 1, 2, 3, 4, 5 };
		System.out.println(maxArea(val));
	}
}
