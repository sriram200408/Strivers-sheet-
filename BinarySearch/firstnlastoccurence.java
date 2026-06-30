package BinarySearch;

import java.util.Scanner;

public class firstnlastoccurence {

    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        if (nums.length == 0)
            return ans;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans[1] = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans[0] = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // array input values
        }
        int ele = sc.nextInt(); // int to find its occurences
        int[] ans = new int[2];
        ans = searchRange(arr, ele);
        System.out.println("first occurence is  " + ans[0] + " last occurence is  " + ans[1]);
        sc.close();
    }
}
