package Bronze3;

import java.util.Scanner;

public class 최댓값_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[9]; // 배열 9개
		int max = 0; // 최대값 저장
		int max_count = 0; // 최대값이 몇번째에 있는지

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				max_count = i;
			}
		}
		System.out.println(max);
		System.out.println(max_count + 1);
	}
}
