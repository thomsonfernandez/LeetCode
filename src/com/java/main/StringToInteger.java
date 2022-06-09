package com.java.main;

public class StringToInteger {
	public static int myAtoi(String s) {
		String response = "";
		boolean sign=false;
		boolean isAnotherChar = false;
		boolean isDigitStarted=false;
		for(int i=0; i<s.length() ; i++) {
			if(s.charAt(i) != '+'){
				//ignore;
				sign = true;
			}else if(s.charAt(i) != ' ' && s.charAt(i) != '-') {

				if(Character.isDigit(s.charAt(i)) && !isAnotherChar) {
					response+=s.charAt(i);
					isDigitStarted=true;
				}else {
					break;
				}
			}else if(s.charAt(i) == '-' && !sign && !isDigitStarted) {
				sign = true;
				response+=s.charAt(i);
			}else if(s.charAt(i) == ' ') {
				//ignore;
			}else{
				isAnotherChar = true;
				break;
			}
			if(response != "" && !response.equals("-")) {
				int respInt = Integer.parseInt(response);
				int digit = respInt % 10;
				if (respInt > Integer.MAX_VALUE/10 || (respInt == Integer.MAX_VALUE / 10 && digit > 7)) return Integer.MAX_VALUE;
				if (respInt < Integer.MIN_VALUE/10 || (respInt == Integer.MIN_VALUE / 10 && digit < -8)) return Integer.MIN_VALUE;
			}
		}
		if(response != ""  && !response.equals("-"))
			return clamp(Integer.parseInt(response), Integer.MIN_VALUE, Integer.MAX_VALUE);
		else
			return 0;

	}

	public static int clamp(int value, int min, int max) {
		return Math.max(min, Math.min(max, value));
	}

	public static void main(String args[]) {
		System.out.println(myAtoi("+1"));
	}
}
