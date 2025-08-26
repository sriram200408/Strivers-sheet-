import java.util.ArrayList;

public class alldivisors {

    // brute force
    // Time complexity = O(n)
    // Space complexity = O(n)
    static ArrayList<Integer> divisors(int x) {
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                divisor.add(i);
            }
        }
        return divisor;
    }

    // Time complexity = O(sqrtn)
    // Space complexity = O(2*sqrtn)
    static ArrayList<Integer> divisors1(int x) {
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        int sqrt = (int) (Math.sqrt(x));
        for (int i = 1; i <= sqrt; i++) {
            if (x % i == 0) {
                divisor.add(i);
                divisor.add(x / i);
            }
        }
        return divisor;
    }

    public static void main(String[] args) {
        int a = 234;
        int b = 543;
        int c = 4808;
        System.out.println(divisors(a));
        System.out.println(divisors(b));
        System.out.println(divisors(c));
        System.out.println(divisors1(a));
        System.out.println(divisors1(b));
        System.out.println(divisors1(c));
    }
}
