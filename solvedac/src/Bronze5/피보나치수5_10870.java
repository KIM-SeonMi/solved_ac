package Bronze5;
import java.util.Scanner;

public class 피보나치수5_10870 {
	static int fibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibo(n-1) + fibo(n-2);
}
	
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      System.out.println(fibo(n));
   }   
}
// 함수를 사용하는 이유
// return fibo(n-1) + fibo(n-2); 이 부분이 계속 반복이 되기 때문이다.
// 피보나치 수는 첫번째 수가 0과 두번째 수 1이
// 고정적이기 때문에 return을 해주는 것이다.
