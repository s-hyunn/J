package ex01;

import java.util.Scanner;

public class Hotel01 {

	public static void main(String[] args) {
		
		// 10개의방
		// 프로그램시작 예약 0으로
		// 화면에 예약안된 상태 출력
		// 예약 안됨0 됨1
		// 몇번방예약? 문 출력
		// 1입력시 0 > 1로 변경
		// 몇면방 예약? 방번호 입력시 그 방 1입력
		// 이미 예약된 방은 이미 예약됐다고 입력
		// 퇴실x
		// 10개 방이 다 차면 만실입니다 안내후 프로그램종료

		Scanner sc = new Scanner(System.in);
		int[] roomnum = new int[10];
		int[] check = new int[10];

		System.out.println("예약현황");
		for (int i = 0; i < roomnum.length; i++) {
			roomnum[i] = i + 1;
			System.out.print(roomnum[i] + "호실" + "      ");
		}
		System.out.println();
		for (int i = 0; i < check.length; i++) {
			System.out.print(check[i] + "         ");
		}
		
		
		while(true){

		System.out.println("\n 몇번 호실을 예약하시겠습니까?");
		int user = sc.nextInt();

		switch (user) {
		case 1:check[0] = 1;
			break;
		case 2:check[1] = 1;
			break;
		case 3:check[2] = 1;
			break;
		case 4:check[3] = 1;
			break;
		case 5:check[4] = 1;
			break;
		case 6:check[5] = 1;
			break;
		case 7:check[6] = 1;
			break;
		case 8:check[7] = 1;
			break;
		case 9:check[8] = 1;
			break;
		default:check[9] = 1;
			break;
		}
		
		
		
		
		
		
		
		
		
			}
		}
}
