package wipro;
import java.util.*;
public class array_question1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr= new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			sum=sum+arr[j];
		}
		double avg=(double)sum/n;
		System.out.println(sum);
		System.out.println(avg);
	}
}
