package BasicRecursion;

import java.util.Scanner;

public class reversearray {
    static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            reverseArray(arr, ++start, --end);
        }
        if (start == end)
            return;
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, size - 1);
        printArr(arr);
        sc.close();
    }

}
