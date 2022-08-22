package Bronze3;
import java.util.Scanner;

public class 별찍기13_2523 { // 이등변삼각형

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int n = sc.nextInt();
 
		for (int i = 1; i <= n; i++) {	// 1 ~ n
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 
		for (int i = n - 1; i > 0; i--) {	// n+1 ~ 2n-1
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
