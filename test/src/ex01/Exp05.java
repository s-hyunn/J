package ex01;

import java.util.Random;
import java.util.Scanner;

public class Exp05 {

	private static final String C = null;

	public static void main(String[] args) {
		//주사위 100번 주사위 눈들의 각 횟수 구하기
		Scanner sc= new Scanner(System.in);
		Random rd = new Random();
		int[] table = new int[6];
						
		int one =0;
		int two =0;
		int three =0;
		int four =0;
		int five =0;
		int six =0;
		
		int x =1;
		
		char c = 'c';
		
		switch(c) {
		case 6: System.out.println("1입니다");                  //명령문 들 break
		case 67: System.out.println("2입니다"); break;
		case 4: System.out.println("3입니다"); break;
		
		default: System.out.println("아무것도 아닙니다");break;
		}
		
		
		
		String s = "C";	
		
		               //명령문 들 break
		
		
		
		
		
		
		
		
		while (true) {
			int dice = rd.nextInt(5) + 1;
			
			System.out.println("주사위를 굴려주세요");
			
			for(;;)
			
			if(dice==1) {
				one++;
			}else if(dice==2) {
				two++;
			}else if(dice==3) {
				three++;
			}else if(dice==4) {
				four++;
			}else if(dice==5) {
				five++;
			}else {
				six++;
				
			}
//		System.out.println("1: "+ one +" 회"+ " 2: "+ two +" 회"+" 3: "+ three +" 회"
//			+ " 4: "+ four +" 회" +" 5: "+ five +" 회"+" 6: " + six + " 회");
//		
//		break;
		
		
		
		}
	}

}
