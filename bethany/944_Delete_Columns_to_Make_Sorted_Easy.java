class Solution {
    public int minDeletionSize(String[] A) {
        int count = 0;
        int colIndex = 0;
        while(colIndex < A[0].length()){
            char min = A[0].charAt(colIndex);
            for(int i = 0; i < A.length; i++){
                //System.out.println(min + " compare with " + A[i].charAt(colIndex));
                if(A[i].charAt(colIndex) < min){
                    count++;
                    break;
                }
                else if(A[i].charAt(colIndex) > min){
                    min = A[i].charAt(colIndex);
                }
            }
            colIndex++;
        }
        return count;
    }
}

//Results:
//Runtime: 15 ms, faster than 55.89% of Java online submissions for Delete Columns to Make Sorted.
//Memory Usage: 39.4 MB, less than 88.55% of Java online submissions for Delete Columns to Make Sorted.
