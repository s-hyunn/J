package ex01;

public class Test04 {

	public static void main(String[] args) {
		//1번
		int[] arr = new int[10];
		for(int i = 0; i < 10 ; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			
			
		}
		
		
		System.out.println("\n");
		
		int[] a = new int[5];
		int[] b = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(a[i] + " ");
						
		}
		System.out.println("\n");
		
		
		//짝수홀수 구분해서 넣기
		
		for(int i = 0 ; i < 5 ; i++) {	
			System.out.print(b[i] + " ");
			
		}
		System.out.println("\n--");
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
