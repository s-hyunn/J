package ex01;

import java.util.Random;
import java.util.Scanner;

public class Game02 {

	public static void main(String[] args) {
		// 게임그만할때 전적 표시 실행횟수 승리 패배 and= && , or=||

		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		int win = 0;
		int draw = 0;
		int lose = 0;
		int count = 0;

		while (true) {
			int com = rd.nextInt(3) + 1;

			System.out.println("가위 바위 보 게임 시작 \n 1:가위 2:바위 3:보 를 입력해주세요.");
			System.out.print("승 " + win + "회" + "    무 " + draw + "회" + "    패 " + lose + "회");

			int user = sc.nextInt();

			System.out.print("컴퓨터 : ");

			if (com == 1) {
				System.out.println("가위");
			} else if (com == 2) {
				System.out.println("바위");
			} else {
				System.out.println("보");
			}

			System.out.print("사용자 : ");
			if (user == 1) {
				System.out.println("가위");
			} else if (user == 2) {
				System.out.println("바위");
			} else {
				System.out.println("보");
			}

			// 비교하기, 승부판별
			if (com == 1 && user == 3) {
				System.out.println("당신이 졌습니다.");
				lose++;
			} else if (com == 1 && user == 2) {
				System.out.println("당신이 이겼습니다.");
				win++;
			} else if (com == 2 && user == 1) {
				System.out.println("당신이 졌습니다.");
				lose++;
			} else if (com == 2 && user == 3) {
				System.out.println("당신이 이겼습니다.");
				win++;
			} else if (com == 3 && user == 2) {
				System.out.println("당신이 졌습니다.");
				lose++;
			} else if (com == 3 && user == 1) {
				System.out.println("당신이 이겼습니다.");
				win++;
			} else {
				System.out.println("비겼습니다.");
				draw++;
			}
			count++;

			System.out.println("게임중.....");
			System.out.println("한번 더 할래?(y:1 / n:0)");
			int ans = sc.nextInt(); // 1또는0입력받기 1이면계속 0중단
			if(win < lose) {
				System.out.println("힌트! 이때까지 컴퓨터가 낸 횟수는 가위"+ com );
			}

			
			if (ans == 0) {
				System.out.print("-----------------\n" + "총 시도 횟수 " + count + " 회 " + "\n" + "승 " + win + "회" + "    무 "
						+ draw + "회" + "    패 " + lose + "회");
				System.out.println("\n----게임을 종료----");
				break;
			}

		}

	}
}
