package com.ruby.java.ch02;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isMarried;
		isMarried = true;
		System.out.println("isMarried = " + isMarried);
		
		char gender;
		gender = 'F';
		//gender = 'Female';
		char c = '\u0058';
		System.out.println("c = " + c);
		
		int num;
		String greeting = "Good Mornig";
		System.out.println("greeting = " + greeting);
		
		long totalSales;
		//num이 4 byte이고 totalsales가 8byte인지 확인하고 싶다
		System.out.println("long type의 길이 = " + Long.SIZE);
		System.out.println("Integer type의 길이 = " + Integer.SIZE);
		System.out.println("Short type의 길이 = " + Short.SIZE);

	}

}

