import java.util.*;

public class Frogjump {
    public static int dpf(int index, int[] heights, int[] dp) {
        if (index == 0)
            return 0;
        if (dp[index] != -1)
            return dp[index];
        int left = dpf(index - 1, heights, dp) + Math.abs(heights[index] - heights[index - 1]);
        int Right = Integer.MAX_VALUE;
        if (index > 1) {
            Right = dpf(index - 2, heights, dp) + Math.abs(heights[index] - heights[index - 2]);
        }
        dp[index] = Math.min(left, Right);
        return dp[index];
    }

    public static int frogjump(int[] heights) {
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return dpf(n - 1, heights, dp);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 2, 1, 7, 6, 5, 8, 3, 5 };
        System.out.println(frogjump(nums));
    }
}