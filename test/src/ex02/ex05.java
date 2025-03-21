package ex02;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// 짝수일지 홀수일지 정수를 받아서 짝수는 0 홀수는 1반환 메인함수는 0짝수입니다 1홀수입니다 출력하는 함수
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		int x= oddeven(user);
		if(x == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
			}
	}
	
	static int oddeven(int user) {
		int result= user%2;
				return result;
	}
		
	
	

}
