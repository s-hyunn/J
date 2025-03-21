package ex01;

public class Arry {

	public static void main(String[] args) {

		int[][] arr = new int[3][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = 1;
				System.out.print(arr[i][j]);
			}
			System.out.println("\t");

		}//5행 5열 배열이름 board 프로그램 시작되면 자동으로 1이라는 숫자가 5곳에 입력되게
		//행 열 번호를 입력 받아서 1의 위치를 찾아라 
		//몇번만에 찾았는지

	}

}
