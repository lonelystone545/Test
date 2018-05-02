package com.wy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("修改");
		Scanner sc = new Scanner(System.in);
		//工作数
		int n = sc.nextInt();
		//小伙伴数
		int m = sc.nextInt();
		//报酬-难度
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			int nandu = sc.nextInt();
			int baochou = sc.nextInt();
			map.put(baochou, nandu);
		}
		
		//能力值
		int[] arr = new int[m];
		for(int i=0;i<m;i++) {
			arr[i] = sc.nextInt();
		}
		int[] res = new int[m];
		for(int i=0; i<arr.length; i++) {
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if((arr[i] > entry.getValue() || arr[i] == entry.getValue() ) && res[i] < entry.getKey()) {
					res[i] = entry.getKey();
				}
			}
		}
		for(int i: res) {
			System.out.println(i);
		}
	}
}
