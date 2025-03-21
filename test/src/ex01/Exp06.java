package ex01;

import java.util.Random;

public class Exp06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		
		int[] table = new int[6];
		
		for(int x=0;x < 100;x++) {
			int dice= rd.nextInt(6)+1;
			
			switch(dice) {
			case 1 : table[dice-1]++; break;
			case 2 : table[dice-1]++; break;
			case 3 : table[dice-1]++; break;
			case 4 : table[dice-1]++; break;
			case 5 : table[dice-1]++; break;
			case 6 : table[dice-1]++; break;
			default : break;
			
			
				
			}
		} for(int i = 0 ; i<table.length; i++){
			System.out.println(table[i]);
		}
}
}
		
	


