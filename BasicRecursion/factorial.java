package BasicRecursion;

public class factorial {
    static void Factorial(int x, long ans) {
        if (x == 0) {
            System.out.println(ans);
            return;
        }
        ans *= x;
        Factorial(--x, ans);
    }

    public static void main(String[] args) {
        Factorial(6, 1);
        Factorial(10, 1);
        Factorial(15, 1);
    }
}
