package com.java.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestPalindrome {
	public static String longestPalindrome(String s) {
		int i=0, j = s.length()-1, counter =0;
		String response;
		List<String> arrayList = new ArrayList<String>();
		while (i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				response = s.substring(counter, j);
				counter = i;
				arrayList.add(response);
				System.out.println(response);
				break;
			}
		}
//		String max = Collections.max(arrayList, Comparator.comparing(String::length)); // or s -> s.length()
		return null;
	}
	public static void main(String[] args) {
		System.out.println("resuly: "+longestPalindrome("test"));
	}
	
	
}
