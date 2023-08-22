package com.ruby.java.ch14;

import java.util.Scanner;

interface Verify3 {
	boolean check(int n, int d);
}

public class Test04_1 {
	public static void main(String[] args) {
		Verify3 vf = (n,d) -> (n % d) == 0;
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		int n, b;
		
		while(true) {
			//메시지
			System.out.print("숫자 입력 : ");
			//스캐너에서 숫자 입력받고 2개 nextInt()
//			int n = sc.nextInt();
//			if (n == 0) break;
			if ((n = sc.nextInt()) == 0) break;
			if ((b = sc.nextInt()) == 0) break;
			
			if (vf.check(n, b)) System.out.println("베수입니다.");
			else				System.out.println("배수가 아닙니다.");
		}
		System.out.println("Done");
	
			} 
			 
		}
