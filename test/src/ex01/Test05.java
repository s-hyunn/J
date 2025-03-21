package ex01;

public class Test05 {

	public static void main(String[] args) {
		float f = 13.625f; //접미사 f 안쓰면 더블형이됨
		int n = Float.floatToIntBits(f);
		
		System.out.println(Integer.toBinaryString(n));
		
		byte bNum = 127;
		
		bNum = (byte)(bNum + 1); //형변환 int >> byte
		
		System.out.println("bNum : " + bNum);
		
		int n1 = 10;
		
		String binaryString = Integer.toBinaryString(n1);
		System.out.println(binaryString);
		
		int n2 = 0b1010;
		System.out.println(n2); //2진수 접두어 0b
		
		int n3 = 0017;
		System.out.println(n3); //8진수 접두어 0
		
		int n4 = 0xA5;
		System.out.println(n4); //16진수 접두어 0x
		
		int o = 1; //2진수로 저장 
		
		System.out.println(o <<1); // << = 비트상에서 한칸씩 왼쪽으로 이동 쉬프트 연산자
		System.out.println(o <<2);
		System.out.println(o <<3);
		
	}

}
