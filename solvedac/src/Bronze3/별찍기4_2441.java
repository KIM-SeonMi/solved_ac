package Bronze3;

import java.util.Scanner;

public class 별찍기4_2441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (i - 1 >= j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
