class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> toReturn = new ArrayList<Integer>();
        for(int i = left; i <= right; i++){
            if(isSelfDiv(i)){
                toReturn.add(i);
            }
        }
        return toReturn;
    }
    public boolean isSelfDiv(int x){
        int org = x;
        while(x != 0){
            int mod = x % 10;
            if(mod == 0 || (org % mod) != 0){
                return false;
            }
            x -= mod;
            x /=10;
        }
        return true;
    }
}

//Results:
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Self Dividing Numbers.
//Memory Usage: 32.6 MB, less than 100.00% of Java online submissions for Self Dividing Numbers.
