package BinarySearch;

import java.util.Scanner;

public class upperbound {
    static int upper(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        int ans = arr.length;
        while (start <= end) {
            mid = (start + end) / 2;
            if (ele < arr[mid]) {
                ans = mid;
                end = mid - 1;

            } else if (ele >= arr[mid]) {
                start = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value to search");
        int ele = sc.nextInt();
        System.out.println("the index is " + upper(arr, ele));
        sc.close();
    }
}