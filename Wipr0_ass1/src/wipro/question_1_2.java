package wipro;
import java.util.*;
public class question_1_2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i ==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("is prime");
		}
		else {
			System.out.println("is not prime");
		}
		sc.close();
		}
}
