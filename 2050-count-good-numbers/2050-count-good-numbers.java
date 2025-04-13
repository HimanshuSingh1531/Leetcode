class Solution {
    public int countGoodNumbers(long n) {
        final int MOD = 1_000_000_007;
        
        long evenPositions = (n + 1) / 2; // even indices (0, 2, 4, ...)
        long oddPositions = n / 2;        // odd indices (1, 3, 5, ...)

        long evenChoices = modPow(5, evenPositions, MOD); // 5 choices at even indices
        long oddChoices = modPow(4, oddPositions, MOD);   // 4 choices at odd indices

        return (int)((evenChoices * oddChoices) % MOD);
    }

    // Fast exponentiation (modular power)
    private long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}