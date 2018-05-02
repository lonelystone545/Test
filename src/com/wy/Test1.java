package com.wy;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
		String s = "abbcccddeefffgggcc";
		List<String> list = fun(s,2);
		for(String s1 : list) {
			System.out.println(s1);
		}
	}
	
	public static List<String> fun(String s, int n) {
		
		List<String> res = new ArrayList<>();
		char[] chs = s.toCharArray();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<chs.length-1; i++) {
			if(chs[i]==chs[i+1]) {
				sb.append(chs[i]);
				count ++;
			} else {
				if(count == n) {
					sb.append(chs[i]);
					res.add("("+(i-count+1)+","+i+","+ sb.toString() +")");
				} else {
					count = 0;
					sb.delete(0, sb.length());
				}
			}
		}
		return res;
	}

}
