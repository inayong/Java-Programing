package com.ruby.java.ch04;
//삼각형Test40
public class Test39 {
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}	
//	i=0,1,2,3,4/j=0,1,2,3,4
