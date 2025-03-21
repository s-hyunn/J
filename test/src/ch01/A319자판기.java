package ch01;

import java.util.Scanner;

public class A319자판기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] drink = new String[4];
		drink[0] = "사이다";
		drink[1] = "콜라";
		drink[2] = "커피";
		drink[3] = "에너지드링크";

		int[] prices = { 800, 900, 500, 700 };
		int price = 0;
		int remain = 0;
		int change=0;
		
		while (true) {
			System.out.println("돈을 넣어주세요");

			int user = sc.nextInt();
			int total = user + remain;

			System.out.println(total + "원이 확인되었습니다.");

			System.out.println("상품 번호를 입력해주세요." + "\n 1사이다800원 2 콜라900원 3 커피500원 4 에너지드링크700원");

			int item = sc.nextInt();

			if (item == 1) {
				System.out.println(drink[0] + "를 선택하셨습니다");
			}
			if (item == 2) {
				System.out.println(drink[1] + "를 선택하셨습니다");
			}
			if (item == 3) {
				System.out.println(drink[2] + "를 선택하셨습니다");
			}
			if (item == 4) {
				System.out.println(drink[3] + "를 선택하셨습니다");
			}

			if (item == 1) {
				price = prices[0];
			} else if (item == 2) {
				price = prices[1];
			} else if (item == 3) {
				price = prices[2];
			} else if (item == 4) {
				price = prices[3];
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				continue;
			}

			if (total >= price) {
				 change = total - price;
				System.out.println("자판기에 남아있는 돈은 " + change + "원 입니다.");
			} else {
				System.out.println("금액이 부족합니다. " + (price - total) + "원이 더 필요합니다.");
			}

			System.out.println("남은 잔돈을 반환하시겠습니까? \n yes:1 no:0");
			int coin = sc.nextInt();
			if (coin == 1) {
				System.out.println("잔돈이 " + change + "원 반환되었습니다 \n이용해주셔서 감사합니다.");
				break;

			} else if (coin == 0) {
				remain = total - price;
				System.out.println("자판기에 " + remain + "원 남아있습니다.");
			}

		}
	}

}
