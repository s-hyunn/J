package ex02;

public class A선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 5, 6, 2, 1, 4, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] >= arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}

			}for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			
			
			}
			System.out.println();
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
