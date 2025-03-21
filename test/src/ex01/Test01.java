package ex01;

public class Test01 {

	public static void main(String[] args) {
		int n = 5;
		int m = 10;
		int k = 20;
		int sum = f(n, m, k);

		System.out.println(sum);
	}

	static int f(int n, int m, int k) {
		int[] A = new int[3];
		int sum = 0;

		for (int i = 0; i < A.length; i++) {
			if (i == 0)
				A[i] = n;
			else if (i == 1)
				A[i] = m;
			else if (i == 2)
				A[i] = k;

			sum = sum + A[i];
		}

		return sum;

	}

}
