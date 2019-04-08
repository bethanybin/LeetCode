class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int toReturn = 0;
        for(int i = 0; i < nums.length; i = i + 2){
            toReturn += nums[i];
        }
        return toReturn;
    }
}

//Results:
//Runtime: 15 ms, faster than 86.00% of Java online submissions for Array Partition I.
//Memory Usage: 41 MB, less than 81.96% of Java online submissions for Array Partition I.
