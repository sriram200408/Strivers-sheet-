package BinarySearch;

import java.util.Scanner;

public class insertposition {
    static int insertpos(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < ele)
                start = mid + 1;
            else if (arr[mid] >= ele) {
                ans = mid;
                end = mid - 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter values");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value to insert");
        int ele = sc.nextInt();
        System.out.println("The index is " + insertpos(arr, ele));
        sc.close();
    }
}