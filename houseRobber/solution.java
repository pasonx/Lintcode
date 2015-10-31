public class Solution {
    /**
     * @param A: An array of non-negative integers.
     * return: The maximum amount of money you can rob tonight
     */
    public long houseRobber(int[] A) {
        // write your code here
        int length = A.length;
        if (length == 0)
			return 0;
		long[] dp = new long[length];
		if (length == 1)
			return A[0];
		if (length == 2)
			return A[0] > A[1] ? A[0] : A[1];
		dp[0] = A[0];
		dp[1] = A[0] > A[1] ? A[0] : A[1];
		
		for (int i = 2; i < length; ++i)
			dp[i] = dp[i-1] > (dp[i-2] + A[i]) ? dp[i-1] : (dp[i-2] + A[i]);
		return dp[length-1];
    }
}
