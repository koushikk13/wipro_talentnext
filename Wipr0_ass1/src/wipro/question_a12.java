package wipro;
import java.util.*;
public class question_a12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int digit1=sc.nextInt();
		int digit2=sc.nextInt();
		if((digit1%10)==(digit2%10)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		sc.close();
	}
}
