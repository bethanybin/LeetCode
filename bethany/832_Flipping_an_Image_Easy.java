class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] ^= 1;
            }
        }
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length/2; j++){
                int temp = A[i][A[i].length - 1 - j];
                A[i][A[i].length - 1 - j] = A[i][j];
                A[i][j] = temp;
            }
        }
        
        return A;
    }
}
//Results:
//Runtime: 1 ms, faster than 94.68% of Java online submissions for Flipping an Image.
//Memory Usage: 41.1 MB, less than 34.00% of Java online submissions for Flipping an Image.
