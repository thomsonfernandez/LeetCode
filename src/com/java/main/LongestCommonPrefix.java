package com.java.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
//		Arrays.sort(strs);
		
		Arrays.sort(strs, new java.util.Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        // TODO: Argument validation (nullity, length)
		        return s1.length() - s2.length();// comparision
		    }
		});
		
		
		int smallestLength = strs[0].length();
		List<String> st = Arrays.asList(strs);
		
		List<String> val = recursion(st, smallestLength);
		
		return val.get(0);
	}
	
	public static boolean verifyAllEqualUsingStream(List<String> list) {
	     boolean val = list.stream()
	      .distinct()
	      .count() <= 1;
	     System.out.println("val : "+ val);
	     return val;
	}
	public static List<String> recursion(List<String> strs, int smallestLength) {
		List<String> st = new ArrayList<String>();
		for(int i = 0; i<strs.size() ; i++) {
			st.add(strs.get(i).substring(0,smallestLength));
		}
		if(!verifyAllEqualUsingStream(st)) {
			smallestLength--;
			System.out.println("smallestLength : "+ smallestLength);
			st = recursion( st,  smallestLength);
		}
		return st;
	}
	
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		longestCommonPrefix(strs) ;
	}
}
