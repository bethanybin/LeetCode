// 532. K-diff Pairs in an Array - Easy

// Initial thoughts:
// This problem should be doable with O(n^2) loop going through each int and 
// comparing it to the ints that come after it in the array. A helper function 
// to test if the pair is a k pair would also help. Absolute difference means 
// that we would have to use absolute value somehow (is there a java library 
// function?), or just subtract the greater number from the lesser.

// Implementation:

class Solution {
    public int findPairs(int[] nums, int k) {
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((k == 0) && (map.containsKey(nums[i])) && (map.get(nums[i]) == 0)) {
                cnt = cnt + 1;
                map.replace(nums[i], 1);
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = (i + 1); j < list.size(); j++) {
                if (isK(list.get(i), list.get(j), k)) {
                    cnt = cnt + 1;
                }
            }
        }
        return cnt;
    }
    
    public boolean isK(int i, int j, int k) {
        int sum = Math.abs(i - j);
        if (sum == k) {
            return true;
        }
        else {
            return false;
        }
    }
}

// Afterthoughts:
// I hadn't read the problem carefully, and it calls for number of UNIQUE 
// pairs. That means that you must first prune through the input array to make 
// sure that all the values are not duplicates of each other. But this in turn 
// messes up the case of k = 0, and you count the unique pairs of duplicate 
// numbers. I decided to go with a Hashmap to first remove the duplicates, 
// with a condition to check if k were 0 and to increment count. I ended up 
// with a pretty bad runtime. Removing the duplicates should have been O(n) 
// with the Hashmap, but perhaps my if conditions and checks added up. In 
// addition, if k were equal to 0, I could have returned the count right away 
// without checking the rest of the list. Furthermore, incorporating the 
// checks for k = 0 into the hashmap loop was a bad idea, as it basically adds 
// another O(n) time onto our time. A better implementation might have been to 
// first check for k == 0 and count the duplicate pairs with a hashmap, and in 
// the case that k != 0, sort the array with O(log n) and then check the pairs 
// with a O(n^2) loop. 

// Results:
// Runtime: 979 ms, faster than 5.03% of Java online submissions for K-diff 
// Pairs in an Array.
// Memory Usage: 40.5 MB, less than 49.35% of Java online submissions for 
// K-diff Pairs in an Array.
