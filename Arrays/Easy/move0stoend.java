package Arrays.Easy;

import java.util.Scanner;
import java.time.Instant;
import java.time.Duration;

public class move0stoend {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void movetoend(int[] arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                idx = i;
                break;
            }
        }

        for (int j = idx + 1; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
                System.out.println("swapped" + arr[idx] + "," + arr[j]);
                idx++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Instant start = Instant.now();
        movetoend(arr);
        Instant end = Instant.now();
        System.out.println("time taken : " + Duration.between(start, end).toMillis() + "ms");
        printarray(arr);
        sc.close();
    }
}
