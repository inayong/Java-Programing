package com.ruby.java.ch03;

import java.util.Scanner;

public class Test25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Num:");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= num; i+=2) { //굳이 0을 더할 필요가 없으므로 1로 고치는게 깔끔 / i++을 i+=2로 바꾸면 짝수만 더함
//			System.out.println(i);
			sum += i;
		}
		System.out.println("Sum:" + sum);
	}
}
