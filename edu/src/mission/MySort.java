package mission;

class SortInput {

	public static int[] initData() {
		int [] arr = new int [10];
		
		// Random 하게 1~ 100사이 정수 10개를 만들어서 arr에 저장 (중복안되게)
		
		arr[0] = 4;
		arr[1] = 67;
		arr[2] = 40;
		arr[3] = 56;
		arr[4] = 14;
		arr[5] = 23;
		arr[6] = 78;
		arr[7] = 32;
		arr[8] = 8;
		arr[9] = 28;
		
		return arr;
	}
}

public class MySort {
	
	public static void main(String[] args) {
		int[] arr = SortInput.initData();
		
		MySort ms = new MySort();
		
		ms.printArray(arr);
		arr = ms.sort(arr);
		ms.printArray(arr);
	}

	private int[] sort(int[] arr) {
		
		
		return null;
	}

	private void printArray(int[] arr) { 
		 for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}
}