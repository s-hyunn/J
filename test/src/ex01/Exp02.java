package ex01;

public class Exp02 {

	public static void main(String[] args) {
		
//밑으로구구단		for(int i = 1; i < 9; i++) {
//			System.out.println();
//			System.out.print("구구단[" + (i+1) + "]단");
//			
//			for(int k = 1; k < 9; k++) {
//				System.out.print("\t"+ (i+1) + "x" + k + "=" + (i+1)*k );
//			}
//		}
		
		for(int i = 1; i < 9; i++) {			
			System.out.print("구구단[" + (i+1) + "]단" +"\t");
		}
		for(int i = 1; i < 10; i++) {
			for(int k = 2; k <9; k++) {
				System.out.print(k + " * " + i +" = " + k * i + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
