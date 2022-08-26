package Bronze3;
import java.util.Scanner;

public class 짝수를찾아라_3058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[7];
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			int min = 101;
			
			for(int j = 0; j < 7; j++) {
				arr[j] = sc.nextInt();
				
				if((arr[j] % 2) == 0) {
					sum += arr[j];
				if(arr[j] < min) {
					min = arr[j];
				}
			}
		}
			System.out.println(sum + " " + min);
		}
	}
}
