class Solution {
    public List<String> commonChars(String[] A) {
        int counter = 0;
        List<String> toReturn = new ArrayList<String>();
        for(int i = 0; i < A[0].length(); i++){
            Character currChar = A[0].charAt(i);
            counter = 0;
            for(int j = 1; j < A.length; j++){
                if(A[j].indexOf(currChar) >= 0){
                    counter++;
                    int index = A[j].indexOf(currChar);
                    A[j] = A[j].substring(0, index) + A[j].substring(index + 1, A[j].length());
                }
            }
            if(counter == (A.length - 1)){
                String s = Character.toString(currChar);
                toReturn.add(s);
            }
        }
        return toReturn;
    }
        
}

//thoughts: the run time could've been better if i implemented this with hashmaps
//Results:
//Runtime: 24 ms, faster than 12.30% of Java online submissions for Find Common Characters.
//Memory Usage: 39.8 MB, less than 100.00% of Java online submissions for Find Common Characters.
