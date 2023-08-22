package com.ruby.java.ch03;

import java.util.Scanner;

public class Test28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Num:");
			int cnt = sc.nextInt();
			
			if (cnt <= 0)	break;
			
			// A(all), O(odd:홀수), E(even:짝수)
			System.out.print("전체[a]/홀수[o]/짝수[e]:");
			String flag = sc.next();
			
			int sum = 0;
			int a = 0;
			int b = 0;
			if (flag.equals("a")) {          //flag.equals("a")는 플래그 값이 a냐, flag == "a"는 객체가 a냐 / 값과 객체의 차이, 나중에 객체에서 배울것
				a = 1; b = 1;
			} else if (flag.equals("o")) {
				a = 1; b = 2;
			} else if (flag.equals("e")) {
				a = 2; b = 2;
			} else {
				continue;
			}
			
			for (int i = a ; i <= cnt ; i+=b) {
				sum += i;
			}
			System.out.println("sum:" + sum);
		}
		System.out.println("Good Bye!");
	}				
}
//반복문 중첩
//저코드말고 다른것도 생각해볼것
