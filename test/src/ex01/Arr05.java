package ex01;

public class Arr05{

	public static void main(String[] args) {

		int[][] board = new int[5][5];
		

			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[i].length; j++) {
					board[i][j] = 0;
					System.out.print(board[i][j] + " ");

				}
				System.out.println("\t");

			}
		
	}
}
