package Bronze3;

import java.util.Scanner;

public class 약수구하기_2501 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				k--;
			}
			if (k == 0) {
				System.out.println(i);
				break;
			}
		}
		if (k != 0) {
			System.out.println(0);
		}
		sc.close();
	}
}
