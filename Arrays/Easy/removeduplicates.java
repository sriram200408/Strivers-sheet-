package Arrays.Easy;

import java.util.Scanner;

public class removeduplicates {

    static int removeDuplicates(int[] arr) {
        int curr = 0;
        int ptr = curr + 1;

        for (int i = ptr; i < arr.length; i++) {
            if (arr[i] != arr[curr]) {
                curr++;
                arr[curr] = arr[i];
            }
        }
        return curr + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = removeDuplicates(arr);
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

}
