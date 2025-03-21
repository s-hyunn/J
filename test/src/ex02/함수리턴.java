package ex02;

public class 함수리턴{

	public static void main(String[] args) {
		// 리턴 부분에 두가지 이상의 수는 함수로 한번에 보낼 수 있다.
        //
			int n1 = 10;
			int n2 = 20;	
			
		int[] x = f(10,20);
	
		
		System.out.println("두수의 합은 : " + x[0] );
		System.out.println("두수의 차는 : " +  x[1] );
	}
	
	static int[] f(int n1, int n2) {
						
		int arr[]= new int[2];
		arr[0] = n1 + n2 ;
		arr[1] = n1 - n2 ;
				
		return arr;
		
	}
	
}
