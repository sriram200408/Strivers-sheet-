package BasicRecursion;

public class firstNsum {
    static void firstSum(int count, int sum) {
        if (count == 0) {
            System.out.println(sum);
            return;
        }
        sum += count;

        firstSum(--count, sum);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 36;
        firstSum(a, 0);
        firstSum(b, 0);
    }
}
