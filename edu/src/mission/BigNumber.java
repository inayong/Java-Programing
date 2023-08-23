package mission;

import java.io.BufferedReader;
import java.io.FileReader;

public class BigNumber {
	public static void main(String[] args) throws Exception {
		String num1, num2 ;
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			num1 = br.readLine();
			num2 = br.readLine();
			
			int[] arr = new int[num1.length()];
			
			for(int i = 0; i < num1.length(); i++) {
				arr[i] = num1.charAt(i) - '0';
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			
		} catch (Exception e) {}

		// 잘라서 배열만들기, charAt
		

	}
}

