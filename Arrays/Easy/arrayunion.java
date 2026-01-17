package Arrays.Easy;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayunion {
    static ArrayList<Integer> arrayUnion(int n, int m, int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int ptr1 = 0;
        int ptr2 = 0;
        ArrayList<Integer> union = new ArrayList<Integer>();
        while (ptr1 < n && ptr2 < m) {
            if (arr1[ptr1] != arr2[ptr2]) {
                if (arr1[ptr1] < arr2[ptr2] && (union.isEmpty() || arr1[ptr1] != union.get(union.size() - 1))) {
                    union.add(arr1[ptr1]);
                    ptr1++;
                } else if (arr1[ptr1] > arr2[ptr2] && (union.isEmpty() || arr2[ptr2] != union.get(union.size() - 1))) {
                    union.add(arr2[ptr2]);
                    ptr2++;
                }
            } else {
                if (union.isEmpty() || arr1[ptr1] != union.get(union.size() - 1)) {
                    union.add(arr1[ptr1]);
                }
                ptr1++;
                ptr2++;
            }

        }

        if (ptr1 == n) {
            while (ptr2 < m) {
                if (arr2[ptr2] != union.get(union.size() - 1)) {
                    union.add(arr2[ptr2]);
                }
                ptr2++;
            }
        } else if (ptr2 == m) {
            while (ptr1 < n) {
                if (arr1[ptr1] != union.get(union.size() - 1)) {
                    union.add(arr1[ptr1]);
                }
                ptr1++;
            }
        }

        return union;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("enter array 1");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter array 2");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> Union = arrayUnion(n, m, arr1, arr2);
        System.out.print("Union of arr1 and arr2 is: ");
        for (int val : Union)
            System.out.print(val + " ");
        sc.close();

    }
}
