package wipro;
import java.util.*;
public class question_1_5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				if(i==j || i>j) {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}
