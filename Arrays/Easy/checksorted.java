package Arrays.Easy;

import java.util.Scanner;

public class checksorted {
    static boolean checkSorted(int[] arr) {
        if (arr.length < 2)
            return true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean issorted = checkSorted(arr);
        System.out.println(issorted);
        sc.close();
    }
}
