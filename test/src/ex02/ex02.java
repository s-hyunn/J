package ex02;

public class ex02 {

	public static void main(String[] args) {
		// 메인함수는 두개의 정수를 넣어줄거
		//사칙연산을 해주고 결과를 출력
		//메인한테 돌려주지않고 그대로 출력
		//출력하고나면 메인 함수는 프로그램을 종료합니다 출력문 종료.
		calculator(44,6);
		
		System.out.println("프로그램을 종료합니다.");
		
	}

	public static void calculator(int n1, int n2) {
		int a = add(n1, n2);
		int b = sub(n1, n2);
		int c = mul(n1, n2);
		double d = div(n1, n2);
		System.out.println("덧셈"+a+"뺄셈"+b+"곱셈"+c+"나눗셈"+ d);
	}

	public static int add(int n1, int n2) {
 
		return  n1 + n2;
	}

	public static int sub(int n1, int n2) {
	

	return  n1 - n2;
}
	public static int mul(int n1, int n2) {
	

	return  n1 * n2;
}
	public static double div(int n1, int n2) {
	

	return (double) n1/n2;
}
	

	
}
