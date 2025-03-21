package ex01;

public class Exp03good {

	public static void main(String[] args) {
		int[] A = new int[3];
		
		for(int i =0; i <10; i++) {
			if(i==A.length) { //A배열꽉차면 
				
				int[] B= new int[A.length +1]; //B배열을 새로 만들어 A배열보다 1 더 크게 B배열은 비어있거나 0으로 참
				
				for(int k = 0; k <A.length; k++) { //a배열 b로 복사 
					B[k]= A[k];
				}
				A=B;
			}
			A[i]=10;
			System.out.println(A[i]);
		}
		
		
		//이렇게하면 A배열은 허울만 있는것
//		for(int i=0; i < A.length; i++) {
//			int[] B = new int[10];
//			A=B;
//			A[i]=10;
//			System.out.println(A[i]);
//		}
		
		
		

	}

}
