public class countdigits {

    // Time complexity O(logn)
    // Space complexity O(1)
    static int countDigit(int x) {
        int y = 1;
        int count = 0;
        while (x / y > 0) {
            y *= 10;
            count++;
        }
        return count;
    }

    // Time complexity O(1)
    // Space complexity O(1)
    static int countdigit(int x) {
        return (int) (Math.log10(x) + 1);
    }

    public static void main(String[] args) {
        int a = 234;
        int b = 12345;
        System.out.println(countDigit(a));
        System.out.println(countdigit(b));

    }
}
