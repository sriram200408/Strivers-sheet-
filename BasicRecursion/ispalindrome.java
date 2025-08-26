package BasicRecursion;

import java.util.Scanner;

public class ispalindrome {
    static boolean isPalindrome(String str, int idx) {
        if (idx > str.length() / 2) {
            return true;
        }
        if (str.charAt(idx) != str.charAt(str.length() - idx - 1)) {
            return false;
        }
        return isPalindrome(str, ++idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str, 0));
        sc.close();
    }

}
