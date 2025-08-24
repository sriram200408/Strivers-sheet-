public class reversenumber {

    // Time complexity = O(n*logn) [due to Math.operations] n:no of digits
    // Space complexity = O(1)
    static int reverseNumber(int x) {
        int num = 0;
        int div = 10;
        int digit = (int) (Math.log10(x));
        while (digit != -1) {
            num += (x % div) * Math.pow(10, digit);
            x /= div;
            digit--;
        }
        return num;
    }

    // Time complexity = O(n) n:no of digits
    // Space complexity = O(1)
    static int reverseNumber1(int x) {
        int num = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            num = num * 10 + lastDigit;
            x /= 10;
        }
        return num;
    }

    public static void main(String[] args) {
        int a = 10406;
        int b = 20000;
        int c = 20987;
        System.out.println(reverseNumber1(a));
        System.out.println(reverseNumber(b));
        System.out.println(reverseNumber(c));
    }
}
