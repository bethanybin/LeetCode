class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        else if(x < 10){
            return true;
        }
        String num = Integer.toString(x);
        for(int i = 0; i < num.length()/2; i++){
            if(num.charAt(i) != num.charAt(num.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    

}

//solution without converting int to string
