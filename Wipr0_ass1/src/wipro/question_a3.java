package wipro;
import java.util.*;
public class question_a3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String input=sc.nextLine().trim();
	if(input.isEmpty()) {
		System.out.println("No Value");
	}
	else {
		String[] values=input.split("\\s+");
		for(int i=0;i<values.length;i++) {
			if(i != values.length-1) {
				System.out.print(values[i]+" ,");
			}
			else {
				System.out.println(values[i]);
			}
		}
	}
	sc.close();
	
			}
}
