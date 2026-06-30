package BinarySearch;

import java.util.Scanner;

public class floorandceil {
    static void floornceil(int[] arr, int ele) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < ele) {
                start = mid + 1;
            } else if (arr[mid] > ele) {
                ans = mid;
                end = mid - 1;
            } else {
                System.out.println("the floor is " + arr[ans]);
                System.out.println("the ceiling is " + arr[ans]);
                return;
            }
        }
        if (ele < arr[0]) {
            System.out.println("the floor doesnot exist " + " the ceiling is " + arr[0]);
            return;
        } else if (ele > arr[arr.length - 1])
            System.out.println("the floor is " + arr[arr.length - 1] + " ceiling doesnt exists");

        else {
            System.out.println("the floor is " + arr[ans - 1]);
            System.out.println("the ceiling is " + arr[ans]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ele = sc.nextInt();
        floornceil(arr, ele);
        sc.close();
    }
}
