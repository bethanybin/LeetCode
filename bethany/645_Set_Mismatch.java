class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = nums.length;
        int dup = -1;
        int missing = -1;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                dup = nums[i];
            }
            map.put(nums[i], i);
        }
        for(int i = 1; i <= n; i++){
            if(!map.containsKey(i)){
                missing = i;
                break;
            }

        }
        int[] toReturn = {dup, missing};
        return toReturn;
    }
}
