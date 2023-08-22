package mission;
//p.138
public class TestGugudan {
	
	public void printGugudan1() {
		
		for (int j = 2; j <= 9; j++) {
			for(int i = 1; i <= 9; i++) {
//				int j = 
				System.out.println(j + "*" + i + "=" + (j*i));
		}
		}
		
		// 2*1=2  2 3  2 3 4
		// 2*2=4  4 5  5 6 7
		// 2*3=6  8 7  8 9
	}
	
	public static void main(String[] args) {
		
		TestGugudan gg = new TestGugudan();
		gg.printGugudan1();
		
	}
}
