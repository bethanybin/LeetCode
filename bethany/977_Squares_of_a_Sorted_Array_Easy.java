class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}

//Results:
//Runtime: 2 ms, faster than 98.36% of Java online submissions for Squares of a Sorted Array.
//Memory Usage: 42.5 MB, less than 64.97% of Java online submissions for Squares of a Sorted Array.

