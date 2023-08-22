package com.ruby.java.ch03;

import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a:");
		int a = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("b:");
		int b = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("op:");
		int op = sc3.nextInt();
		
		
		
		switch(op) {
		case '+':
			System.out.println(a + b); break;
		case '-':
			System.out.println(a - b); break;
		case '*':
			System.out.println(a * b); break;
		case '/':
			System.out.println(a / b); break;
		}
	}
}
//확실한거 아님