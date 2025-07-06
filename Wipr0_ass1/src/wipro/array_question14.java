package wipro;

public class array_question14 {
    public static void main(String[] args) {
        if (args.length != 9) {
            
            return;
        }

        int[][] arr = new int[3][3];
        int max = Integer.MIN_VALUE;
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) max = arr[i][j];
            }
            System.out.println();
        }

        System.out.println(max);
    }
}
