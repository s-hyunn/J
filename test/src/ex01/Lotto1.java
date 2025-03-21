package ex01;

import java.util.Random;

public class Lotto1 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] lotto = new int[6];
		
		for(int i =0; i < lotto.length ; i++) {
			
		
			int num = rd.nextInt(45)+1;
			lotto[i] = num;
		
			 System.out.println(lotto[i] +" ");	
	    }            

	}

}
