package ex01;

public class Test02 {

	public static void main(String[] args) {
		
		int n = 1;
		int sum = 0;
		while(n <= 9) {
			sum = sum + n;
			n = n + 2;
			System.out.println(sum);
			}	
	
		
		//오늘의자바
		
		
		
		int idx = 0;
		while(idx<10) {
			
			System.out.println("hello1");
			idx++;
		}
		
		for(int idx1=0; idx1<10; idx1++) {
			
			System.out.println("hello2");
		}
		
		//arr 이용해서 정수를 10개 저장할 수 있는 배열 만들기 한번 만들면 수정 불가능		
		//1~10까지 넣기
		//1
		int[] arr = new int[10];
		
		for (int i = 0 ; i<10 ; i++) {
						
			System.out.print(arr[i] + " ");
			
		}
		System.out.println("\n-----------");
		
		//2-1 배열에 값 저장하기 반복문 사용
		
		for(int i = 0; i < 10; i++) {
			arr[i] = i + 1;									
		}
		//2-2 배열에 저장된 값 출력하기
		int idx1 = 0;
		while(idx1 < 10) {
				System.out.print(arr[idx1] + " ");
				idx1++;
		}
	
	
	}
	
	

}
