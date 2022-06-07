package com.java.main;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
	
	public int lengthOfLongestSubstring(String s) {

		Map<Character, Integer> map= new HashMap<Character, Integer>();
		int start=0, len=0;

		// abba
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				if (map.get(c) >= start) 
					start = map.get(c) + 1;
			}
			len = Math.max(len, i-start+1);
			map.put(c, i);
		}

		return len;
	}
}
