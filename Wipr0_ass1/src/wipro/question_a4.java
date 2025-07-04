package wipro;
import java.util.*;
public class question_a4 {
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	char input1=sc.next().charAt(0);
	char input2=sc.next().charAt(0);
	if(input1>input2) {
		System.out.println(input2+" , "+ input1);
	}
	else {
		System.out.println(input1+" , "+ input2);
	}
	sc.close();
}
}
