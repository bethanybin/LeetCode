class Solution {
    public boolean judgeCircle(String moves) {
        int[] Moves =  new int[4];
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'R'){
                Moves[0]++;
            }
            else if(moves.charAt(i) == 'L'){
                Moves[1]++;
            }
            else if(moves.charAt(i) == 'U'){
                Moves[2]++;
            }
            else{
                Moves[3]++;
            }
        }
        return (Moves[0] == Moves[1]) && (Moves[2] == Moves[3]);
    }
}

//Results
//Runtime: 7 ms, faster than 89.69% of Java online submissions for Robot Return to Origin.
//Memory Usage: 39 MB, less than 88.85% of Java online submissions for Robot Return to Origin.
