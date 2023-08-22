package com.ruby.java.ch14;

import java.util.Scanner;

interface NumberFunc2 {
	int func(int n, int m);
}

//스캐너 생성
// 작은 숫자 앞에오게
// sum 값( ex. 5-20까지 합)
public class Test05_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NumberFunc2 sum = (f, t) -> {
			int result = 0;
			for (int i = f; i <= t; i++)
				result += i;
			return result;
		};

		int a, b;
		while (true) {
			System.out.println("from 과 to를 입력");
			if ((a = sc.nextInt()) == 0)
				break;
			if ((b = sc.nextInt()) == 0)
				break;

			if (a > b) { // swap 코드
				int c = a;
				a = b;
				b = c;
			}
			System.out.println(a + "부터 " + b + "까지의 합 : " + sum.func(a, b));

		}
		System.out.println("Done ");

	}
}
