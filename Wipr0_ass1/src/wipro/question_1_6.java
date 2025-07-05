package wipro;
import java.util.*;
public class question_1_6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int rev=0;
		while(number>0) {
			int digit= number%10;
			rev=10*rev+digit;
			number/=10;
		}
		
		System.out.print(rev);
	}
}
