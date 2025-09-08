package Arrays.Easy;

import java.util.Scanner;

public class largestnum {
    static int largestNum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = largestNum(arr);
        System.out.println("largest element is" + " " + ans);
        sc.close();
    }
}
