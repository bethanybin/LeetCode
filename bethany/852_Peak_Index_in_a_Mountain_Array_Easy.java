class Solution {
    public int peakIndexInMountainArray(int[] A) {
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] > A[i+1]){
                return i;
            }
        }
        return 0;
    }
}

//Results:
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
//Memory Usage: 38.9 MB, less than 91.33% of Java online submissions for Peak Index in a Mountain Array.
