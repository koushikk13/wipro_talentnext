package wipro;

import java.util.LinkedHashSet;
import java.util.Set;

public class array_question7 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        Set<Integer> set = new LinkedHashSet<>();
        for (int val : arr) {
            set.add(val);
        }
        System.out.println(set);
    }
}
