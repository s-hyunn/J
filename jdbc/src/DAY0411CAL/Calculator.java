package DAY0411CAL;

public class Calculator implements Ical {
	int num1;
	int num2;

	//인터페이스에 있던걸 재정의했다라는 뜻
	@Override
	public int sum() {
		int sum = num1 + num2;
		return sum;
	}

	@Override
	public int sub() {
		int sub = num1 - num2;
		return sub;
	}

	@Override
	public int mul() {
		int mul = num1 * num2;
		return mul;

	}

	@Override
	public double div() {
		double div = (double) num1 / num2;
		return div;

	}
}
