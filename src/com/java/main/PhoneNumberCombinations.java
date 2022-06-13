package com.java.main;

import java.util.List;

public class PhoneNumberCombinations {
	static
	public List<String> letterCombinations(String digits) {
		for (int i = digits.length()-1; i >= 0; i--) {
			switch(digits.charAt(i)) {
			case '1': num = 1; break;
			case 'V': num = 5; break;
			case 'X': num = 10; break;
			case 'L': num = 50; break;
			case 'C': num = 100; break;
			case 'D': num = 500; break;
			case 'M': num = 1000; break;
			}
			if (4 * num < ans) ans -= num;
			else ans += num;
		}
		return null;
	}
}
