class Solution {
    public int reverse(int x) {
        long temp = x;
        boolean isNegative = false;
        long toReturn = 0;
        if(temp >= Integer.MAX_VALUE || temp <= Integer.MIN_VALUE){
            return 0;
        }
        if(x < 0){
            isNegative = true;
            x *= -1;
        }
        if(x < 10){
                return x;
        }
        while(x != 0){
            int mod = x % 10;
            x -= mod;
            x /= 10;
            toReturn *= 10;
            if(toReturn >= Integer.MAX_VALUE){
                return 0;
            }
            toReturn += mod;
            if(toReturn >= Integer.MAX_VALUE){
                return 0;
            }
        }
        if(toReturn > Integer.MAX_VALUE){
            return 0;
        }
        if(isNegative){
            return (int)toReturn * -1;
        }
        else{
            return (int)toReturn;
        }
    } 
        
}
