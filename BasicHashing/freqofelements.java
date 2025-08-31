package BasicHashing;

import java.util.Scanner;

public class freqofelements {
    static void frequency(int[] arr) {
        boolean[] freq = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (freq[i] == false) {
                int ele = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == ele && freq[j] == false) {
                        count++;
                        freq[j] = true;
                    }
                }
                System.out.println(ele + ":" + count);
            } else
                continue;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        frequency(arr);
        sc.close();
    }
}
