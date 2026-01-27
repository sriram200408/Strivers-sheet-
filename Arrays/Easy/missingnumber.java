package Arrays.Easy;

import java.util.Scanner;

public class missingnumber {
    static int missingNumber(int[] arr, int num) {
        int x1 = 0, x2 = 0;
        for (int i = 0; i < num - 1; i++) {
            x1 ^= arr[i];
            x2 ^= (i + 1);
        }
        x2 ^= num;
        return x1 ^ x2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num - 1];
        for (int i = 0; i < num - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = missingNumber(arr, num - 1);
        System.out.println("missing number is :" + ans);
        sc.close();
    }
}
