class Solution {
    public int hammingDistance(int x, int y) {
        int[] binary1 = new int[40];
        int[] binary2 = new int[40];
        int index1 = 0;
        int index2 = 0;
        int toReturn = 0;
        while(x > 0){
            binary1[index1++] = x % 2;
            x /= 2;
        }
        while(y > 0){
            binary2[index2++] = y % 2;
            y /= 2;
        }
        for(int i = 0; i < 40; i++){
            if((binary1[i]^binary2[i]) == 1){
                toReturn++;
            }
        }
        return toReturn;
    }
}

//Results:
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
//Memory Usage: 31.8 MB, less than 100.00% of Java online submissions for Hamming Distance.
