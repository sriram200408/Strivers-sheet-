package BasicRecursion;

public class fibonacci {

    static void Fibonacci(int x, long curr, long prev) {
        if (x == -1) {
            return;
        }
        long temp = curr;
        curr = curr + prev;
        System.out.print(prev + " ");
        prev = temp;

        Fibonacci(--x, curr, prev);
    }

    public static void main(String[] args) {
        Fibonacci(20, 1, 0);
        System.out.println();
        Fibonacci(5, 1, 0);
        System.out.println();
        Fibonacci(9, 1, 0);
    }
}
