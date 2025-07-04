package wipro;
import java.util.*;
public class question_a11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		if(input<0) {
			System.out.print("Negative");
		}
		else if(input>0) {
			System.out.print("Positive");
		}
		else {
			System.out.print("Neutral");
		}
		sc.close();
	}
}
