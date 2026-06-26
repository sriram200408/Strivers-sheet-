package BinarySearch;

import java.util.Scanner;

public class findinsortedarray {
    static int findelement(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == ele)
                return mid;
            else if (ele < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element to find");
        int ele = sc.nextInt();
        int ans = findelement(arr, ele);
        if (ans == -1)
            System.out.println("element not found ");
        else
            System.out.println("element found at index " + ans);
        sc.close();

    }
}
