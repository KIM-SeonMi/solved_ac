package Bronze3;

import java.util.Scanner;

public class 열개씩끊어출력하기_11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int cnt = 0;

		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			cnt++;

			if (cnt == 10) {
				System.out.println();
				cnt = 0;
			}
		}
	}
}
