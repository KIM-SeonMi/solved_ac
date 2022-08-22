package Bronze3;
import java.util.Scanner;

public class 별찍기7_2444 { // 다이아몬드

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n-i; j++)
				System.out.print(" ");
			
			for(int j = 0; j < 2*i-1; j++)
				System.out.print("*");
				System.out.println();
		}
		
		for(int i = n-1; i >= 1; i--) { // 밑으로 갈수록 별이 줄어듦
			for(int j = 0; j < n-i; j++) /* 3-3 공백 찍을 거 없음 -> 3-2 공백 하나 찍음 -> 3-1 공백 2개찍음 */
				System.out.print(" ");

			for(int j = 0; j < 2*i-1; j++) // 피라미드 모양을 보면 양 옆으로 2개씩 줄어듦 j가 1까지 실행이 되고 반복문 종료
				System.out.print("*");
				System.out.println();
		}
	}
}
