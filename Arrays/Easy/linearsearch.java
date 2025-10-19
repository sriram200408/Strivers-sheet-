package Arrays.Easy;

import java.util.Scanner;

public class linearsearch {
    static boolean linearSearch(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value to search:");
        int ele = sc.nextInt();
        boolean ans = linearSearch(arr, ele);
        if (ans)
            System.out.println("Exists");
        else
            System.out.println("doesnt exist");
        sc.close();
    }
}
