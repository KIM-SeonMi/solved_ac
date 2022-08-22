package Bronze3;

import java.util.Scanner;

public class 지능형기차2_2460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = sum - a + b;

			if (max < sum) {
				max = sum;
			}
		}
		System.out.println(max);
	}
}
