package com.ruby.java.ch09;

import java.util.Random;
import java.util.StringTokenizer;

public class Test01 {
	public static void main(String[] args) {
		Random r1 = new Random();
		System.out.println("난수 = " + r1.nextInt());
		System.out.println("난수 = " + r1.nextInt(10)); //10이하
		String s = "id = guest& name = Amy& pwd = 1004";
		StringTokenizer st = new StringTokenizer(s, "&");
		while(st.hasMoreTokens()) {
			System.out.println("토큰수 = " + st.countTokens());
			System.out.println(st.nextToken());
		}
		int i3 = Integer.parseInt("123");
		int i = 123;
		Integer obj6 = Integer.valueOf(i); //boxing
		Integer obj7 = 22;
		int nx = obj6.intValue(); //unboxing
		Object obj = new Object();
		System.out.println("해시코드 = " + obj.hashCode());
		obj.toString();
		System.out.println(obj);
	}
}
