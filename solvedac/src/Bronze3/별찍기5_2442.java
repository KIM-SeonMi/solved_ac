package Bronze3;
import java.util.Scanner;

public class 별찍기5_2442 { // 피라미드 모양

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			for(int o = 1; o < n-i; o++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
