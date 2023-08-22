package com.ruby.java.ch05;

public class Matrix2 {
	static void addMatrix(int [][]A, int [][]B) {
		//C = A + B
		int [][]C = new int [3][4];
		//코드 작성
		showMatrix(C);
	}
	static void multiplyMatrix(int [][]A, int [][]D) {
		//E = A * D
		int [][]E = new int[3][5];
		showMatrix(E);
	}
	static void showMatrix(int [][]a) {
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j< a[0].length; j++)
				System.out.println(a[i][j]);
	}
	
	public static void main(String[] args) {
		int [][]matrixA = {{1,2,3},{4,5,6}};
		int [][]matrixB = {{1,2,3,7,8,9},{4,5,6,10,11,12}};
		System.out.println(matrixA.length);
		int sumA = 0;
		sumA = makeSum(matrixA);
		int sumB = 0;
		sumB = makeSum(matrixB);
		
	}
	static int makeSum(int [][]A) {
		int sum = 0;
		
//		for () {}
				
			return sum;
	}
		
	
	static int makeSum(int [][]A, int [][]B) {  //메서드 이름은 같게, 파라미터 개수는 다르게(하는일은같음) 
		int sum = 0;
		
//		for () {}
		
		return sum;
	}
}
