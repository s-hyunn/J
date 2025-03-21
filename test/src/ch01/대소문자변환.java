package ch01;

public class 대소문자변환 {

	public static void main(String[] args) {
		char[] x = { 'A', 'B', 'C', 'D', 'E' };

		for (int i = 0; i < x.length; i++) {
			System.out.print((char) (x[i]));

		}
		System.out.println();
		for (int j = 0; j < x.length; j++) {
			x[j] += 32;
			System.out.print((char) (x[j]));

		}
		
	}
}
