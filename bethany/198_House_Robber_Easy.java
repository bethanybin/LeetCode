class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        int max = dp[1];
        for(int i = 1; i < nums.length; i++){
            dp[i + 1] = nums[i] + dp[i - 1];
            if(dp[i + 1] < max){
                dp[i + 1] = max;
            }
            else{
                max = dp[i+1];
            }
        }
        return dp[nums.length];
    }
}

//Results:
//Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
//Memory Usage: 33.4 MB, less than 99.99% of Java online submissions for House Robber.
