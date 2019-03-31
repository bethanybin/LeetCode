import java.util.HashMap;
class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> stones = new HashMap<Character, Integer>();
        int totalCount = 0;
        for (int s = 0; s < S.length(); s++){
            if(!stones.containsKey(S.charAt(s))){
                stones.put(S.charAt(s), 1);
            }
            else{
                int num = stones.get(S.charAt(s));
                num++;
                stones.put(S.charAt(s), num);
            }
        }
        for(int j = 0; j < J.length(); j++){
            if(stones.containsKey(J.charAt(j))){
                totalCount += stones.get(J.charAt(j));
                stones.remove(J.charAt(j));
            }
        }
        
        return totalCount;
    }
}

//Results:
//Runtime: 2 ms, faster than 96.21% of Java online submissions for Jewels and Stones.
//Memory Usage: 36.8 MB, less than 87.95% of Java online submissions for Jewels and Stones.
