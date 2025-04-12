package DAY0411CAL;

public class Calculator2 extends Calculator implements Ical {

	public int absNum(int num) {
		if (num < 0) {
			return num * -1;
		} else
			return num;
	}
}
