package com.ruby.java.ch04;

import java.util.Scanner;

public class Test37 {
	public static void main(String[] args) {
		
		//배열 개수 정하고 점수 입력받기?
		//배열을 입력하고 점수 입력?
		
//		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("count:");
		int a = sc.nextInt();
		
		int[] score = new int[a];
		for(int i = 0; i < a; i++) {
			System.out.print("num:");
			score[i] = sc.nextInt();
		}
		
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
		
		avg = sum / score.length;
		System.out.println("총 점 : " + sum);
		System.out.println("평 균 : " + avg);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
}
