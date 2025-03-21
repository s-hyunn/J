package ex02;

public class ex01 {

	public static void main(String[] args) {

		int x = add3(10);
		f1();
		f2(22);
		System.out.println(x);
		
		int a = add(1,2);
		System.out.println("덧셈" + a);
		int b = minus(2,3);
		System.out.println("뺄셈" + b);
		int c = multi(2,3);
		System.out.println("곱셈" + c);
		double d = divi(2,3);
		System.out.println("나눗셈" + d);
		
	}

	public static int add3(int n) {
		int result = n + 3;
		return result;

	}

	// 이름 f1 반환자료형x 입력자료x 실행 : f1함수실행
	public static void f1() {

		System.out.println("f1함수실행..");

	}
//		이름:f2 반환자료x=void 입력자료 o :정수 (괄호안에 입력) 실행:syso

	public static void f2(int n) {
		System.out.println(n);
	}
// 두개의 수가 주어지면 덧셈 뺄셈 곱셈 나눗셈 > 메인이 받아서 화면에 출력
	
	public static int add(int n1, int n2) {
		int sum = n1+n2;  
		
		return sum;
		}
		
	public static int minus(int n1, int n2) {
			 
			return n1 -n2;
			
			
		}
	public static int multi(int n1, int n2) {
			
			int multi = n1*n2;
			
			return multi;
		}
	public static double divi(int n1, int n2) {
			
		double	divi = (double)n1/n2;
			return divi;
		}
	}

