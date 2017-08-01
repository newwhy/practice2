package prob1;

import java.util.Scanner;
import java.util.stream.*;


// 키보드에서 
public class Prob1 {
	public static void main(String[] args) {
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		int sum = IntStream.of(MONEYS).sum();	
		System.out.println("금액: " + sum);

        int fiftyThousand = sum/50000; sum %= 50000;
        System.out.println("50000원 " + fiftyThousand + "개");
     
        int tenThousand = sum/10000; sum %= 10000;
        System.out.println("10000원 " + tenThousand + "개");
     
        int fiveThousandWon = sum/5000; sum %= 5000;
        System.out.println("5000원 " + fiveThousandWon + "개");
        
        int oneThousandWon = sum/1000; sum %= 1000;
        System.out.println("1000원 " + oneThousandWon + "개");
        
        int fiveHundredWon = sum/500; sum %= 500;
        System.out.println("500원 " + fiveHundredWon + "개");
        
        int oneHundredWon = sum/100; sum %= 100;
        System.out.println("100원 " + oneHundredWon + "개");
        
        int fiftyWon = sum/50; sum %= 50;
        System.out.println("50원 " + fiftyWon + "개");
        
        int tenWon = sum/10; sum %= 10;
        System.out.println("10원 " + tenWon + "개");
        
        int fiveWon = sum/5; sum %= 5;
        System.out.println("5원 " + fiveWon + "개");
        
        int oneWon = sum/1; sum %= 1;
        System.out.println("1원 " + oneWon + "개");
      	
}
}