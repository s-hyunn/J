package ex02;

public class ex04 {

	public static void main(String[] args) {
		// 메인함수가 원하는 만큼 라인을 만들 수 있도록 함수 생성

		linePrint(5); // 호출문
		linePrint(2);
		linePrint(23);
		linePrint1(24, '?');

	}

	static void linePrint(int n) { // 괄호안 매개변수 변수선언 해야됨
		for (int i = 0; i < n; i++) {
			System.out.print("-");

		}
		System.out.println();

	}

	static void linePrint1(int x, char s) { // 괄호안 매개변수 변수선언 해야됨
		for (int i = 0; i < x; i++) {
			System.out.print(s);

		}
	}
}
