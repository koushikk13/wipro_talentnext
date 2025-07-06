package wipro;

public class array_question2 {
	public static void main(String[] args) {
        int[] arr = {10, 25, 3, 89, 6, 77};

        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println( max);
        System.out.println(min);
    }
}
