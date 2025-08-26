public class gcdof2num {

    // Time complexity = O(n) [brute force]
    static int gcd(int x, int y) {
        int ans = 0;
        for (int i = x; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    // Time complexity = O(min(x,y)) [euclidean substraction]
    static int gcd1(int x, int y) {
        while (x != 0 || y != 0) {
            if (x > y) {
                x -= y;
            } else if (y > x) {
                y -= x;
            } else {
                return x;
            }
        }
        if (x != 0)
            return x;
        else
            return y;
    }

    // Time complexity = O(log(min(x,y))) [euclidean modulus]
    static int gcd2(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(gcd(20, 15));
        System.out.println(gcd2(9, 12));
        System.out.println(gcd1(504, 12354));
    }
}
