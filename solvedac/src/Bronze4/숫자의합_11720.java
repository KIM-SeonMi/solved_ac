package Bronze4;
	
import java.util.Scanner;
	
public class 숫자의합_11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   	 
	   	int n = sc.nextInt();
	   	String s = sc.next();
	   	int sum = 0;
	   	// int result = 0;
	   	
	   	for(int i = s.length()-1; i > -1; i--) {
	   		char ch = s.charAt(i);
	   		sum += ch - '0';
	   		
	   		// result += s.charAt(i)-'0';
	   	}
	   	System.out.println(sum);
	   	// System.out.println(result);
	}
}
