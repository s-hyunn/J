package ex01;

import java.util.Random;
import java.util.Scanner;

public class Arrgame01 {

	public static void main(String[] args) {
		//5행 5열 배열이름 board 프로그램 시작되면 자동으로 1이라는 숫자가 5곳에 입력되게
				//행 열 번호를 입력 받아서 1의 위치를 찾아라 
				//몇번만에 찾았는지
		int[][] board= new int[5][5];
		
		Scanner sc= new Scanner(System.in);
		Random rd= new Random();
		
		int bomb = 0;
		
		for(int i =0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j]=0;
				System.out.print(board[i][j]+" ");
				
			}System.out.println("\t");
		}

	}

}
