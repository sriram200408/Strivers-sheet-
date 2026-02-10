package Arrays.Easy;

import java.util.Scanner;

public class find1timerepeat {
    static int repeat(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = repeat(arr);
        System.out.println(ans);
        sc.close();
    }
}
