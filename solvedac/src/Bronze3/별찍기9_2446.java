package Bronze3;
import java.util.Scanner;

public class 별찍기9_2446 { // 모래시계

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = n; i > 0; i--) { // 밑으로 갈수록 별이 줄어듦
			for(int o = n - i; o > 0; o--) { // 3-3 공백 찍을 거 없음 -> 3-2 공백 하나 찍음 -> 3-1 공백 2개 찍음
				System.out.print(" ");
			}
			for(int j = i*2-1; j > 0; j--) { // 피라미드 모양을 보면 양 옆으로 2개씩 줄어듦 j가 1까지 실행이 되고 반복문 종료
				System.out.print("*");
			}
			System.out.println();
		} // 여기까지가 피라미드 반대모양
		
			for(int i = 1; i < n; i++) { // 밑으로 갈수록 별이 늘어남, 대신 가운데 별은 하나 찍어야 하기 때문에 1부터 시작
				for(int o = 1; o < n-i; o++) {
					System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // 여기까지가 피라미드 모양
	}
}
