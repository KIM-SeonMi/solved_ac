package Bronze3;

import java.util.Scanner;

public class 오븐시계_2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m, value;

		h = sc.nextInt();
		m = sc.nextInt();
		value = sc.nextInt();

		m = m + value;

		if (m >= 60) {
			while (m >= 60) {
				m = m - 60;
				h++;

				if (h >= 24) {
					h = 0;
				}
			}
		}
		System.out.println(h + " " + m);
	}
}
