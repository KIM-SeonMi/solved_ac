package Bronze3;
import java.util.Scanner;

public class 공_1547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // 공이 들어있는 시작 위치
		int gong = 1; // 공의 시작 위치
		
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x == gong)
				gong = y;
			else if(y == gong)
				gong = x;
		}
		System.out.println(gong);
	}
}
