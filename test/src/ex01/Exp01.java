package ex01;

public class Exp01 {

	public static void main(String[] args) {
		int[] A = {1, 3, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//1.A배열안에 홀수의 개수를 구하시오.
		
		int cnt = 0;
		int x = 0; //값의 범위 0~9
		int count1 = 0;
	
		while(x < 10) {
			if(A[x] % 2 != 0) {
				cnt = cnt +1;								
			}
			x++;				
		}
		System.out.println("홀수의 갯수는" +" " + cnt + "개입니다." );
		
		for(int i = 0; i < 10; i++ ) {
			if(A[i] % 2==0) {
				count1++;
			}		
		}System.out.println("짝수의 갯수는" +" " + count1 +"개입니다.");	
		
	}	
	
}


