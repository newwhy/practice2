package prob4;
public class Prob4 {

	public static void main(String[] args) {
	
		
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
//스트링을 뒤집어서 스트링배열을 return해야한다
		char[] src = str.toCharArray();
		char[] dest  = new char[ str.length() ];
		
		return null;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
	}
}
