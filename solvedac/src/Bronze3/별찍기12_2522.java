package Bronze3;

import java.util.Scanner;

public class 별찍기12_2522 { // 이등변삼각형 반대로

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 위쪽
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 아래쪽
		for (int i = 1; i <= n - 1; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
