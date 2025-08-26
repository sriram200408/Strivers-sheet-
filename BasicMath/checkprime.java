public class checkprime {

    // Time complexity = O(sqrtn)
    // Space complexity = O(1)
    static boolean isPrime(int x) {
        int sqrt = (int) (Math.sqrt(x));
        int count = 0;
        for (int i = 1; i <= sqrt; i++) {
            if (x % i == 0) {
                count += 2;
            }
        }
        if (count == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int a = 13;
        int b = 63;
        int c = 91;
        System.out.println(isPrime(a));
        System.out.println(isPrime(b));
        System.out.println(isPrime(c));
    }

}
