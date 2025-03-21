package ch01;

import java.util.Random;
import java.util.Scanner;

public class 함수가위바위보 {
	static int win = 0;
	static int draw = 0;
	static int lose = 0;
	static int count = 0;

	public static void main(String[] args) {
		// 1.컴 2.사람 3.판정

		while (true) {
			System.out.println("\n가위 바위 보 게임 시작 \n 1:가위 2:바위 3:보 를 입력해주세요.");

			int com = comInput();
			int user = userInput();

			int ans = judge(com, user);

			System.out.print("-----------------\n" + "총 시도 횟수 " + count + " 회 " + "\n" + "승 " + win + "회" + "    무 "
					+ draw + "회" + "    패 " + lose + "회");
			if (ans == 0) {
				break;
			}
		}

	}

	static int comInput() {
		Random rd = new Random();
		int comInput = rd.nextInt(3) + 1;

		return comInput;
	}

	static int userInput() {
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		return userInput;
	}

	static int judge(int c, int u) {

		Scanner sc = new Scanner(System.in);

		System.out.print("컴퓨터 : ");

		if (c == 1) {
			System.out.println("가위");
		} else if (c == 2) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}

		System.out.print("사용자 : ");
		if (u == 1) {
			System.out.println("가위");
		} else if (u == 2) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}

		// 비교하기, 승부판별
		if (c == 1 && u == 3) {
			System.out.println("당신이 졌습니다.");
			lose++;
		} else if (c == 1 && u == 2) {
			System.out.println("당신이 이겼습니다.");
			win++;
		} else if (c == 2 && u == 1) {
			System.out.println("당신이 졌습니다.");
			lose++;
		} else if (c == 2 && u == 3) {
			System.out.println("당신이 이겼습니다.");
			win++;
		} else if (c == 3 && u == 2) {
			System.out.println("당신이 졌습니다.");
			lose++;
		} else if (c == 3 && u == 1) {
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
		if (win < lose) {
			System.out.println("힌트! 이때까지 컴퓨터가 낸 횟수는 가위" + c);
		}

		if (ans == 0) {
			System.out.println("\n----게임을 종료----");

		}

		return ans;
	}

}
