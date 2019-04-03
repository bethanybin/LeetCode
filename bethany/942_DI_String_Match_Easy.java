class Solution {
    public int[] diStringMatch(String S) {
        int minBound = 0;
        int maxBound = S.length();
        int[] perm = new int[S.length() + 1];
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'I'){
                perm[i] = minBound;
                minBound++;
            }
            else{
                perm[i] = maxBound;
                maxBound--;
            }
        }
        perm[S.length()] = minBound;
        return perm;
    }
}
//Results:
//Runtime: 2 ms, faster than 99.62% of Java online submissions for DI String Match.
//Memory Usage: 38.3 MB, less than 96.15% of Java online submissions for DI String Match.
