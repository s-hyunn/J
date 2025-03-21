package ex01;

public class Exp07 {

	public static void main(String[] args) {
		
		int[] A = {1,2,3,4,5,6,7,8,9,10};
		
		
		int evensum= 0;
		
		
		
		for(int i=0; i< A.length ;i++ ) {
			if(i % 2==1 ) {
				continue;                // 점프느낌
			}else {
				evensum = evensum+A[i];
				
			}
			 
			
			
		}
		System.out.println(evensum + " "); //요소값 배열도 명시해야됨
	}

}
