package Bronze2;
import java.util.Scanner;

public class 피시방알바_1453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 손님의 수
		int[] arr = new int[101]; // 최대로 받을 수 있는 사람을 담는 배열
		int cnt = 0; // 거절 당하는 사람 수 카운트
		
		for(int i = 0; i < n; i++) { // n만큼 반복
			int person = sc.nextInt(); // 사람 수 입력받음
			arr[person]++; // 배열에 사람 수만큼 담고 ++
			
			if(arr[person] > 1) // 배열에 담긴 사람 수가 1이면
				cnt++; // 거절당하는 사람 수 ++
		}
		System.out.println(cnt);
	}
}
