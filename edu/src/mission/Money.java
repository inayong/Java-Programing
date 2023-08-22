package mission;

import java.util.Scanner;

// 상품 가격 167,000원을 지불하기 위해 필요한 최소 지폐 장수는 아래와 같다.
// 5만원*3장, 1만원*1장, 5천원*1장, 1천원*2장

public class Money {
	public static void main(String[] args) {
		
		int[] money = {50000,10000,5000,1000};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Price : ");
		int pr = sc.nextInt();
		
		
//		int a = pr / money[0];
		for (int i = 0; i < money.length; i++) {
			int cnt = pr / money[i]; //장수
			pr = pr % money[i]; //나머지
			System.out.println(money[i] + "원 : " + cnt + "장" );
		}
		
	}
		
}
