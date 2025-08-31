package BasicHashing;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class highnlowfreq {

    // Brute force
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

    // using hashmap
    static void hashfreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int maxEle = 0;
        int minEle = 0;
        int maxFreq = 0;
        int minFreq = arr.length;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();
            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
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
        hashfreq(arr);
        sc.close();
    }
}
