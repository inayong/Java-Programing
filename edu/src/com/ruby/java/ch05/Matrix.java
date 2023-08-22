package com.ruby.java.ch05;

import java.util.Random;
//행렬 덧셈, 곱셈

public class Matrix {
	static void addMatrix(int [][]A, int [][]B) {
		//C = A + B
		int [][]C = new int [3][4];
		//코드 작성
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C[0].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
				
		}		
		showMatrix(A);		showMatrix(B);
		showMatrix(C);
	}
	
	static void multiplyMatrix(int [][]A, int [][]D) {
		//E = A * D
		int [][]E = new int[3][5];
		for (int i = 0; i < E.length; i++) {
			for (int j = 0; j < E[0].length; j++) {
				for (int k = 0; k < E[0].length; k++) {
					E[i][j] = A[i][k] * D[k][j];
				}
			}
		}
		showMatrix(A);		showMatrix(D);
		showMatrix(E);
	}
	
	static void showMatrix(int [][]C) {
		System.out.println();
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j< C[0].length; j++)
				System.out.print(C[i][j] + " ");
		System.out.println();
		}
	}
	static void showMatrixe(int [][]E) {
		System.out.println();
		for (int i = 0; i < E.length; i++) {
			for (int j = 0; j< E[0].length; j++)
				System.out.print(E[i][j] + " ");
		System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Random random = new Random(); //랜덤 객체 생성
		int A[][] = new int [3][4];
		int B[][] = new int [3][4];
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < A[0].length; j++)
			{
				A[i][j] = random.nextInt(5);
				B[i][j] = random.nextInt(5);
				
			}
		addMatrix(A,B);
		
		int D[][] = new int [4][5];
		for (int i = 0; i < A.length; i++)
			for (int j = 0; j < A[0].length; j++)
			{
				A[i][j] = random.nextInt(5);
				D[i][j] = random.nextInt(5);
				
			}
		multiplyMatrix(A,D);
	}
	
}
		
//		System.out.println(A.length);
//		int sumA = 0;
//		sumA = makeSum(A);
//		int sumB = 0;
//		sumB = makeSum(B);
//		
//	}
//	static int makeSum(int [][]A) {
//		int sum = 0;
//		
////		for () {}
//				
//			return sum;
//	}
//		
//	
//	static int makeSum(int [][]A, int [][]B) {  //메서드 이름은 같게, 파라미터 개수는 다르게(하는일은같음) 
//		int sum = 0;
//		
////		for () {}
//		
//		return sum;
//	}
//}
