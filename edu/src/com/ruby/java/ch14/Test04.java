package com.ruby.java.ch14;

import java.util.Scanner;

interface Verify2 {
	boolean check(int n, int d);
}

public class Test04 {
	public static void main(String[] args) {
//		Verify2 vf = (n,d) -> (n % d) == 0;
//		System.out.println(vf.check(24, 3));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		
		//무한 루프,, d가 n의 배수인지 아닌지 출력/ 입력값이 0이면 종료
		while((n % d) == 0) {
			if(n == 0) {
				break;
			} 
			 
		}
	}
}
