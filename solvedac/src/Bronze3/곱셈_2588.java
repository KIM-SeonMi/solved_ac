package Bronze3;

import java.util.Scanner;

public class 곱셈_2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println(a * (b % 10));
		System.out.println(a * (b / 10 % 10));
		System.out.println(a * (b / 10 / 10 % 10));
		System.out.println(a * b);
	}
}
