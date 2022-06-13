package com.java.main;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		int count = 0;
		boolean postiveInteger = true;
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		if(dividend == 0 || divisor == 0)
			return 0;

		if(dividend < 0 && divisor < 0)
			postiveInteger = true;

		if(dividend < 0 && divisor > 0)
			postiveInteger = false;

		if(dividend > 0 && divisor < 0)
			postiveInteger = false;

		if(dividend < 0 ) {
			dividend = -dividend;
		}
		if(divisor < 0 ) {
			divisor = -divisor;
		}

		System.out.println("postiveInteger : "+postiveInteger);
		System.out.println("dividend : "+dividend);
		System.out.println("divisor : "+divisor);

		while(dividend >= divisor) {
			count++;
			dividend-=divisor;
		}

		if(postiveInteger)
			return count;
		else
			return -count;
	}

	public static void main(String[] args) {

	}
}
