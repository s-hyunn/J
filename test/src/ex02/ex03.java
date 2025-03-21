package ex02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// f1() > f1 함수 실행
		// f2() > f2 함수 실행
		// 숫자를 입력 음수 : 종료 0포함 양수 짝수 f1실행 홀수 f2실행

		while (true) {
			System.out.println("숫자를 입력하세요");
			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();

			if (user % 2 == 0) {
				f1();
			} else if (user % 2 == 1) {
				f2();

			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	public static void f1() {
		System.out.println("f1함수를 실행중");
	}

	public static void f2() {
		System.out.println("f2함수를 실행중");

	}

}
