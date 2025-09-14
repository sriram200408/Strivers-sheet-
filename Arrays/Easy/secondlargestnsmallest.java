package Arrays.Easy;

import java.util.Scanner;

public class secondlargestnsmallest {
    static void second(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            } else if (arr[i] > secondmax && arr[i] != max)
                secondmax = arr[i];

            if (arr[i] < min) {
                secondmin = min;
                min = arr[i];
            } else if (arr[i] < secondmin && arr[i] != min)
                secondmin = arr[i];

        }
        System.out.println("secondmax =" + " " + secondmax);
        System.out.println("secondmin =" + " " + secondmin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        second(arr);
        sc.close();
    }
}
