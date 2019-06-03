class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean toReturn = false;
        boolean foundOne = false;
        for(int i = 0; i < bits.length; i++){
            if(foundOne){
                toReturn = false;
                foundOne = false;
            }
            else{
                if(bits[i] == 0){
                    toReturn = true;
                }
                else{
                    foundOne = true;
                    toReturn = false;
                }
            }
        }
        return toReturn;
    }
}


//Results: Runtime: 0 ms, faster than 100.00% of Java online submissions for 1-bit and 2-bit Characters.
//Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for 1-bit and 2-bit Characters.
