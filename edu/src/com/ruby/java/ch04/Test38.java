package com.ruby.java.ch04;

public class Test38 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
//				if(i == j)
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		
//		//1부터 뽑아서 6차이 나게끔? 배열 크기 6?
//		//i=0/j=0, i=1/j=1, i2j2, i3j3, i4j4, 
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				if(i==j) {
//					System.out.println();
//				}
			}	
	}

