package ex01;

import java.util.Random;

public class Exp08 {

	public static void main(String[] args) {
		int score = 100;
		switch(score/10) {
		case 10 :  System.out.println("A+"); 
		case 9 :  System.out.println("A"); break; 
		case 8 :  System.out.println("B"); break; 
		case 7 :  System.out.println("C"); break;
		case 6 :  System.out.println("D"); break;
		
		default : System.out.println("F"); break;
		}
		System.out.println("\n----------");
		
		
		//로또번호 추출기 만들기 번호는 45까지 6개 중복 배열에 하나씩 추가 6개되면 출력 
		Random rd = new Random();
		int[] lotto = new int[6];
		
		for(int i =0; i < lotto.length ; i++) {
			
		
			int num = rd.nextInt(45)+1;
			lotto[i] = num;
		
			 System.out.println(lotto[i] +" ");	
	    }            
		
		
		
		
		
		
		
			
		
		
		
		
		
	}	
}					
		
		

	


