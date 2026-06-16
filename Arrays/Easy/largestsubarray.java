package Arrays.Easy;

import java.util.Scanner;

class largestsubarray {
    static int subarray(int[] arr, int k) {
        int ptr1 = 0;
        int ptr2 = 0;
        int sum = arr[0];
        int length = 1;
        int subarray = 0;
        while (ptr2 < arr.length) {
            if (sum == k) {

                if (length > subarray) {
                    subarray = length;
                }
                if (ptr2 < arr.length - 1) {
                    length++;
                    ptr2++;
                    sum += arr[ptr2];
                    continue;
                }

            }

            if (sum < k && ptr2 < arr.length - 1) {
                ++ptr2;
                sum += arr[ptr2];
                ++length;
                continue;
            }
            if (sum > k && ptr2 > ptr1) {
                sum -= arr[ptr1];
                ++ptr1;
                --length;
                continue;
            }
            if (sum > k && ptr1 >= ptr2) {
                ptr1++;
                ptr2++;
                if (ptr1 >= arr.length)
                    break;
                sum = arr[ptr1];
                length = 1;
                continue;
            }
            if (ptr2 == arr.length - 1) {
                break;
            }

        }

        return subarray;
    }

    static int subarray1(int[] arr, int k) {
        int left = 0, sum = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left++];
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = subarray(arr, k);
        int ans1 = subarray1(arr, k);
        System.out.println("Longest length of subarray is " + ans);
        System.out.println("Longest length of subarray is " + ans1);
        sc.close();

    }
}