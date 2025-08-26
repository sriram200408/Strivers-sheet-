public class checkpalindrome {

    static int reverseNumber1(int x) {
        int num = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            num = num * 10 + lastDigit;
            x /= 10;
        }
        return num;
    }

    static boolean ispalindrome(int x) {
        int pali = reverseNumber1(x);
        if (x == pali)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a = 19273;
        int b = 1425241;
        int c = 14641;
        System.out.println(ispalindrome(a));
        System.out.println(ispalindrome(b));
        System.out.println(ispalindrome(c));
    }
}
