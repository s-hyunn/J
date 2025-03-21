package ex02;

public class A0318ㅁ3{

	public static void main(String[] args) {
//		int n1=5;
//		int n2=2;
//		System.out.printf("f함수 실행전 : %d, %d\n", n1,n2);
//		
//		
//		f(n1,n2);
//		System.out.printf("f함수 실행후 : %d, %d\n", n1,n2);
//		
//		static void f(int x, int y) {
//		 int temp= x;
//		 x = y;
//		 y = temp;
//	 } 변수가 저장하고 있는 값이 주소일때 참조자료형이라고 부름
		int[] A= new int[2];
		A[0] =5;
		A[1] =3;
		System.out.printf("f함수 실행전 : %d, %d\n",A[0], A[1]);
		f1(A);
		System.out.printf("f함수 실행전 : %d, %d\n",A[0], A[1]);
	}
		static void f1(int A[]) {
			if(A[0]==5) {
				A[0]=3;
			}
			if(A[1]==3){
				A[1]=5;
//			//int temp = A[0]
//				A[0]=A[1];
//				A[1]=temp;
			}System.out.println();
			
		}
	
}
