//Initial thoughts:
//this is going to be straight forward. return first element that set contains
class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++){
            if(set.contains(A[i])){
                return A[i];
            }
            else{
                set.add(A[i]);
            }
        }
        return A[0];
    }
}

//Results:
//Runtime: 1 ms, faster than 98.82% of Java online submissions for N-Repeated Element in Size 2N Array.
//Memory Usage: 40.4 MB, less than 83.86% of Java online submissions for N-Repeated Element in Size 2N Array.
