class Solution {
    public int[] sortArrayByParity(int[] A) {
        int oddPointer = A.length - 1;
        int i = 0;
        while(i < oddPointer){
            if((A[i] % 2) != 0){
                int temp = A[oddPointer];
                A[oddPointer] = A[i];
                A[i] = temp;
                oddPointer--;
            }
            else{
                i++;
            }
        }
        return A;
        
    }
}

//Results:
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
//Memory Usage: 41.8 MB, less than 37.24% of Java online submissions for Sort Array By Parity.
