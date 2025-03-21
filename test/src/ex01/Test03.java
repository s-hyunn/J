package ex01;

public class Test03 {

	public static void main(String[] args) {
		//반복문 연습 배열연습
		int idx = 0;
		while(idx < 10) {
			System.out.println((idx) + 1 +") 하이");
			
			
			
			idx++;
		}
		
		//배열선언 
		int[] arr = new int[10];
		int x = 0;
		
		
		
		for(int idx1 = 0; idx1 < 10; idx1++) {
			//System.out.print(arr[x] +")( 하이");
			System.out.print(arr[idx1] +" ");
			idx++;
		
		}
		
		 //x는 1씩 증가한다
		 //y는 1씩 증가한다
		
		for(int i=1; 1<11; i++) { //i변수의 값의 범위 0~9
			arr[i] = i + 1; //배열의 인덱스 변수 x의 값의 범위 0~9
			
		
		}
		
		
		
		
		
		
		
		
		
	}

}

