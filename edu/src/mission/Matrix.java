package mission;

public class Matrix {
	public static void main(String[] args) {
		int[][] a = { 
				{ 1, 2, 3, 4 }, 
				{ 2, 3, 4, 5 }, 
				{ 3, 4, 5, 6 } 
				};
		
		int[][] b = { 
				{ 6, 5, 4 }, 
				{ 5, 4, 3 }, 
				{ 4, 3, 2 }, 
				{ 3, 2, 1 } 
				};
		
		// c[i][j] = a[i][k] * b[k][j];
		
		int[][] c = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < b.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
