package wipro;
import java.util.*;
public class question_a5 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	char ch= sc.next().charAt(0);
	if(Character.isDigit(ch)) {
		System.out.println("is number");
	}
	else if(Character.isLetter(ch)) {
		System.out.println("is alphabet");
	}
	else {
		System.out.println("special character");
	}
	sc.close();
}
}
