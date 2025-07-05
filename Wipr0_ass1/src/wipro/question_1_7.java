package wipro;
import java.util.*;
public class question_1_7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int num1=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=10*rev+digit;
			num/=10;
			
		}
		if(num1==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
