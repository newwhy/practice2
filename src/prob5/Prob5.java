package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		// 게임 변수 초기화
		int minNumber = 1;
		int maxNumber = 100;

		// 정답 램덤하게 만들기
		Random random = new Random();
		
		for( int i = 0; i < 100; i++) {
			int correctNumber = random.nextInt(maxNumber) + minNumber;
			System.out.println( correctNumber );

			
// 스트링비교할때는 String s = scanner.next();
// if ( s=equals("y")			
			
		}
	}

}