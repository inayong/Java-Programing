package mission;



import java.util.Scanner;

//<소수판단> 임의의 수를 입력 받아서 해당 수가 소수인지 확인하는 프로그램을 작성
public class Ms1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Num:");
		int num = sc.nextInt();
		
		if(num <= 2) {
			System.out.println("더 큰 수를 입력하세요.");
			return;
		}
		
		// num = 8; 2, 3, 4, 5, 6, 7
		int i;
//+		int len = num / 2; //숫자가 클때 
//		for (i = 2; i <= len; i++) {
		for(i = 2; i < num; i++) {
			if (num % i == 0)
				break;
		}
//		if (len <= i ) {
		if (i == num) {
			System.out.println("소수");
			return;
		}
		System.out.println("소수 아님.");
	}
}
