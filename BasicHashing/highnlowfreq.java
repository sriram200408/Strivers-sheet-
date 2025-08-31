package BasicHashing;

import java.util.Scanner;

public class highnlowfreq {
    static void frequency(int[] arr) {
        int highest = 0;
        int lowest = 1;
        int lowcount = 1;
        int highcount = 0;
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
                if (count > highcount) {
                    highest = ele;
                    highcount = count;
                }

                if (count <= lowcount) {
                    lowest = ele;
                    lowcount = count;
                }

            } else
                continue;
        }
        System.out.println("highest frequency is" + ":" + highest + " " + "count is " + highcount);
        System.out.println("lowest frequency is" + ":" + lowest + "  and " + "  count is " + lowcount);

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
