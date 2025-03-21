package ex02;

public class A0318ㅁ {

	public static void main(String[] args) {

		int n = 20;
		char x = 'A';
		f(n, x);

		System.out.print("\n ----End---- ");

	}

	static void f(int n, char x) {

		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0) {
				System.out.print('b');
			} else {
				System.out.print(x);

			}
			
		}System.out.println();
	}
}

// AAAAAAAAAAAAAAAAAAAAAA ---End---