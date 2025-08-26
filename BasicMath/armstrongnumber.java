public class armstrongnumber {
    static boolean armstrong(int x) {
        int temp = x;
        int digits = (int) (Math.log10(x) + 1);
        int num = 0;
        for (int i = 0; i < digits; i++) {
            num += Math.pow(x % 10, digits);

            x /= 10;
        }
        if (temp == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int a = 153;
        int b = 7162;
        int c = 371;
        System.out.println(armstrong(a));
        System.out.println(armstrong(b));
        System.out.println(armstrong(c));
    }
}
