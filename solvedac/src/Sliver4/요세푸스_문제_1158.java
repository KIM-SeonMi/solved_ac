package Sliver4;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class 요세푸스_문제_1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		System.out.print("<");

		while (!q.isEmpty()) {
			cnt++;
			if (cnt % K != 0) {
				q.add(q.poll());
			} else if (q.size() == 1)
				System.out.print(q.poll() + ">");
			else
				System.out.print(q.poll() + ", ");

		}
	}
}