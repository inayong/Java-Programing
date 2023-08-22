package com.ruby.java.ch02;

public class Test8 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		int d = 30;
		
//		System.out.println(a > b); // false
//		System.out.println(a < b); // true
//		System.out.println(a >= b); // false
//		System.out.println(a <= b); // true
//		System.out.println(a == b); // false
//		System.out.println(a != b); // true
		
		a = a + b;
		a += b; // => a = a + b;
		a -= b;
		a %= b;
		
		if (a < b & c < d)
			System.out.println("a가 작다");
		else
			System.out.println("b가 작다");
		
		System.out.println(a > b);
		
		
		
	}
}
