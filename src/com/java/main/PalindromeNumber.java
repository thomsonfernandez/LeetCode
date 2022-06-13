package com.java.main;

public class PalindromeNumber {
	public boolean isPalindrome(int number) {
		int y=number;int temp=0, x=0;
		while(number>0)
		{
			x=number%10;
			number=number/10;
			temp=temp*10+x;
		}
		System.out.println(temp);
		if(temp == y) {
			return true;
		}
		return false;

	}
}
