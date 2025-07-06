package wipro;

import java.util.Arrays;
public class array_question5 {
    public static void main(String[] args) {
        int[] arr = {23, 1, 56, 3, 78, 0};
        Arrays.sort(arr);

        System.out.println( arr[0] + ", " + arr[1]);
        System.out.println(arr[arr.length - 1] + ", " + arr[arr.length - 2]);
    }
}
