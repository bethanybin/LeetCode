class Solution {
    public int repeatedStringMatch(String A, String B) {
        int lengthB = B.length();
        int counter = 1;
        StringBuilder str = new StringBuilder();
        str.append(A);
        while(str.length() < lengthB){
            str.append(A);
            counter++;
        }
        if(str.indexOf(B) != -1){
            return counter;
        }
        else{
            if(str.append(A).indexOf(B) != -1){
                return ++counter;
            }
        }
        return -1;
        
    }
}

//Results:
//Runtime: 113 ms, faster than 80.34% of Java online submissions for Repeated String Match.
//Memory Usage: 37.4 MB, less than 35.80% of Java online submissions for Repeated String Match.
//
