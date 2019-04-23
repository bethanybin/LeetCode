class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] copyNums = new int[nums.length];
        copyNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int toReturn = 0;
        int p1 = 0;
        int p2 = nums.length - 1;
        while(p1 < nums.length && p2 > -1){
            if(copyNums[p1] != nums[p1] && copyNums[p2] != nums[p2]){
                return p2 - p1 + 1;
            }
            else if(copyNums[p1] != nums[p1]){
                p2--;
            }
            else if(copyNums[p2] != nums[p2]){
                p1++;
            }
            else{
                p1++;
                p2--;
            }
        }
        return toReturn;
        
    }
}

//Results:
//Runtime: 8 ms, faster than 81.90% of Java online submissions for Shortest Unsorted Continuous Subarray.
//Memory Usage: 40.7 MB, less than 93.10% of Java online submissions for Shortest Unsorted Continuous Subarray.
