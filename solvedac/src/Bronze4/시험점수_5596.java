package Bronze4;

import java.util.Scanner;

public class 시험점수_5596 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int s = 0;
      int t = 0;
      int sum1 = 0;
      int sum2 = 0;
      
      for(int i = 0; i < 4; i++) {
    	  s = sc.nextInt();
    	  sum1 += s;
      }
      for(int i = 0; i < 4; i++) {
    	  t = sc.nextInt();
    	  sum2 += t;
      }
      if(sum1 > sum2)
    	  System.out.println(sum1);
      else if(sum2 > sum1)
    	  System.out.println(sum2);
      else if(sum1 == sum2)
    	  System.out.println(sum2);
   }
}