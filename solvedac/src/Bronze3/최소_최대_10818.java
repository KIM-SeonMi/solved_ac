package Bronze3;
import java.util.Scanner;

public class 최소_최대_10818 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = -1000000;
		int min = 1000000;
		int[] array = new int [n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if (max < array[i])
				max = array[i];
			
			if (min > array[i])
				min = array[i];
		}
		System.out.println(min + " " + max);
	}
}
