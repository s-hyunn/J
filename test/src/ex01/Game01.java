package ex01;

import java.util.Random;
import java.util.Scanner;

public class Game01 {

	public static void main(String[] args) {
		//1랜덤수를 만든다
		//2랜덤수를 저장한다
		//3 랜덤수를 맞히기 위해 수를 입력한다.
		//4 입력한 수와 랜덤수를 비교한다
		//	4-1 같으면 "맞혔습니다"라고 안내문을 보이고 종료한다
		//	4-2 다르면 랜덤수보다 입력한 수가 작으면 "더 큰 수를 입력하세요" 안내문을 보여준다.
		//	4-3 다르면 랜덤수보다 입력한 수가 크면 "더 작은 수를 입력하세요" 라고 안내문을 보여준다.
		//++ 횟수를 저장하는 변수 만들기.
		
		
		
		Random rd = new Random(); //1.자료형 변수 선언
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0; //횟수저장변수++
		
		int rdNum = rd.nextInt(10)+1; //2. 랜덤수 저장
		System.out.print("숫자를 입력하세요.");
		//반복시작해야하는 구간
		while(true) {
			cnt++;
		int inputNum = sc.nextInt(); //3 수 입력
		
		if(inputNum == rdNum) {
			System.out.print(cnt + "번째에 맞혔습니다");//4정답 종료
			break;
		}else {
			if(inputNum > rdNum) {
				System.out.print("더 작은 수를 입력하세요ㅋ");//-3
				
			}else {
				System.out.print("더 큰 수를 입력하세요ㅋ");//-2			
			}
		}					
	}
		
		
		int n = sc.nextInt(); //정수값을 받는 코드
		System.out.println(n);
				
		
		
		
		
		
	}

}
