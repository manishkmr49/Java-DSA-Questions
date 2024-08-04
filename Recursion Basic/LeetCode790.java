class LeetCode790 {
    public int numTilings(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 5;

        int mod = 1000000007;
        int[] dp = new int[n + 1];
        dp[0] = 1;  // Base case for n = 0
        dp[1] = 1;  // Base case for n = 1
        dp[2] = 2;  // Base case for n = 2
        dp[3] = 5;  // Base case for n = 3

        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + 2 * dp[i - 3]) % mod;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        LeetCode790 solution = new LeetCode790();
        System.out.println(solution.numTilings(4)); // Example usage
    }
}
