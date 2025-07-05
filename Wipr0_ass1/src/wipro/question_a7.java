package wipro;
import java.util.*;
public class question_a7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char letter=sc.next().charAt(0);
		if(Character.isUpperCase(letter)) {
			System.out.println(Character.toLowerCase(letter));
		}
		else if(Character.isLowerCase(letter)){
			System.out.println(Character.toUpperCase(letter));
		}
		sc.close();
	}
}
