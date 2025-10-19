package Arrays.Easy;

import java.util.Scanner;

public class rotatebyk {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate1(int[] arr, int k, String dir) {
        k = k % arr.length;
        if (dir.equals("left")) {
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);
        }
        if (dir.equals("right")) {
            reverse(arr, 0, arr.length - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
        }
    }

    static void rotate(int[] arr, int k, String dir) {
        if (k >= arr.length) {
            k = k % arr.length;
        }
        if (dir.equals("left")) {
            System.out.println("this is left rotation");
            int count = 0;
            while (count < k) {
                int temp = arr[0];

                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = temp;
                count++;
            }
        } else {
            System.out.println("this is right rotation");
            int count = 0;
            while (count < k) {
                int temp = arr[arr.length - 1];

                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
                count++;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        System.out.println("enter array values");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the rotation size");
        int k = sc.nextInt();
        System.out.println("enter the rotation direction");
        String str = new String();
        str = sc.next();
        System.out.println("enter logic no(1 / 2)");
        int logic = sc.nextInt();
        if (logic == 1) {
            rotate1(arr, k, str);
        } else {
            rotate(arr, k, str);
        }
        printarray(arr);
        sc.close();
    }
}
