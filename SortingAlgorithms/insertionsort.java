// need to work on the logic again 

package SortingAlgorithms;

import java.util.Scanner;

public class insertionsort {

    static void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    static void InsertionSort(int[] arr) {
        int idx = 1;
        while (idx != arr.length) {
            int i = idx - 1;
            int curr = idx;
            while (i > -1) {

                if (arr[curr] < arr[i]) {
                    swap(arr, curr, i);
                    curr = i;

                }
                i--;
            }

            idx++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
