// 1. Two Sum - Easy

// Initial Thoughts:
// None

// Implementation:

class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] returnL = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        
        if ((nums[i] + nums[j]) == target) {
          returnL[0] = i;
          returnL[1] = j;
          return returnL;
        }
      }
    }
    return returnL;
  }
}

// Afterthoughts:
// None

// Results:
// Runtime: 25 ms, faster than 26.56% of Java online submissions for Two Sum.
// Memory Usage: 38.5 MB, less than 44.70% of Java online submissions for Two 
// Sum.