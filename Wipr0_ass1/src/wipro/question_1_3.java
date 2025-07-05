package wipro;
import java.util.*;
public class question_1_3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int start= sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<end;i++) {
			int count=0;
			if(i>1) {
				for(int j=1;j<=i;j++) {
					if(i%j == 0) {
						count++;
					}
				}
				if(count==2) {
					System.out.println(i);
				}
			}
			
		}
		}
}
