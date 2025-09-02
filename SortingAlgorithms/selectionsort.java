package SortingAlgorithms;

import java.util.Scanner;

public class selectionsort {

    static void swap(int a, int b, int[] arr) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
        return;
    }

    static void selection(int[] arr) {
        int min = 0;
        while (min != arr.length - 1) {
            int idx = min;
            for (int i = min + 1; i < arr.length; i++) {
                if (arr[i] < arr[idx]) {
                    idx = i;
                }
            }
            swap(min, idx, arr);
            min++;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        selection(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
