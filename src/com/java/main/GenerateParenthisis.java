package com.java.main;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthisis {
	public List<String> generateParenthesis(int n) {
		String leftPara = "(";
		String rightPara = ")";
		 List<String> list = new ArrayList<String>();
		for(int i=0; i<n ; i++) {
			list.add(leftPara+rightPara);
		}
		
		return null;
		
	}
}
