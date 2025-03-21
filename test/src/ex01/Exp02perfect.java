package ex01;

public class Exp02perfect {

	public static void main(String[] args) {
		// 배열 안의 최대값 구하기, 최소값 구하기, 총합 구하기, 배열의 평균 구하기
		int[] A = {1, 11, 3, 4, 5, 6, 7, 8, 9, 10};
		int max = A[0];
		int min = A[0];
		int x=0;
		int sum=0;
		float avg= 0.0f;
		
		for(int i=0; i<10; i++) {
			if(A[i] > max ) {
				max = A[i];
			}
		}	
		System.out.println("최대값은"+ max +"입니다.");
		
		for(int i=0; i<10; i++) {
			if(A[i] < min) {
				min = A[i];
			}
		}
		System.out.println("최소값은"+ min +"입니다.");
		
		for(int i=0; i<10; i++) {
			if(A[i] % 3==0) {
				x++;
			}
		}
		System.out.println("3의배수는"+ x +"개입니다.");
		
		for(int i=0; i<10; i++) {
			sum += A[i];
		}
		System.out.println("배열의 총합은" + sum + "입니다.");
	
		
			avg = (sum * 1.0f) / A.length;
		
		System.out.println("배열의 평균은" + avg + "입니다.");
	}
	
	
}
