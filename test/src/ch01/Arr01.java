package ch01;

public class Arr01 {

	public static void main(String[] args) {

		int n = 5;
		int m = 10;
		int k = 20;
		int sum = f(n, m, k);

		int[] a = g(sum);

		int n1 = 22;
		int n2 = 44;

		int z = add(n1, n2);
		int x = sub(n1, n2);
		int c = mul(n1, n2);
		double v =  div(n1, n2);
		
		double t = calc(z, x, c, v);
		
		System.out.println(sum);
		System.out.println("g로부터 받은 몫은 " + a[0] + " 나머지는 " + a[1] + " 입니다");
		
		if (t % 2 == 0) {
System.out.println("받은 값은 짝수입니다");
		}
		else {
		System.out.println("받은 값은 홀수입니다");
		}
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

	static int[] g(int j) {

		int[] arr = new int[2];

		arr[0] = j / 3;
		arr[1] = j % 3;

		return arr;
	}

	static double calc(int z, int x, int c, double v) {
		double total = z + x + c + v;

		return total;

	}

	static int add(int n1, int n2) {
		int add = n1 + n2;

		return add;
	}

	static int sub(int n1, int n2) {
		int sub = n1 - n2;

		return sub;
	}

	static int mul(int n1, int n2) {
		int mul = n1 * n2;

		return mul;
	}

	static double div(int n1, int n2) {
		double div = (double)n1 / n2;

		return div;
	}

}
