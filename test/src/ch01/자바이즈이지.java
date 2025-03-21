package ch01;

import java.util.Scanner;

public class 자바이즈이지 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] str = { 'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'e', 'a', 's', 'y' };
		
		char[] temp = new char[str.length];
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] == 32) {
			temp[i]=str[i];
			} else {
				temp[i]='*';
			}
			System.out.print(temp[i]);

		}
		System.out.println();
		
		while(true) {
		System.out.println("Call character ! >> ");
		int user = sc.nextInt();
		for (int j = 0; j < str.length; j++) {

			if ( user== str[j]) {
				temp[j]=str[j];
			}else if(str[j]==32) {
				temp[j]=str[j];
			}
			else {
				 System.out.println("틀려쓰");
			}
		}

	
}
}}