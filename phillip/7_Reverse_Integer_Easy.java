// 7. Reverse Integer - Easy

// Initial thoughts:
// This problem is doable by just dividing and modding by 10 repeatedly to 
// form the new sum. A sign check would have to be done in the beginning to 
// keep track of the sum's sign, and then reapplied at the end.

// Implementation:

class Solution {
    public int reverse(int x) {
        boolean positivesign = true;
        if (x < 0) {
            positivesign = false;
        }
        int total = 0;
        int mod = 0;
        int div = Math.abs(x);
        while (div != 0) {
            mod = div % 10;
            if ((total < -214748364) || (total > 214748364)) {
                return 0;
            }
            total = (total * 10) + mod;
            div = div / 10;
        }
        if (positivesign) {
            return total;
        } else {
            return (total * -1);
        }
    }
}


// Afterthoughts:
// My top-level worked well enough, except I didn't read the problem carefully 
// enough to see that they said assume that the integer is in the range of 
// -2^31 to 2^31 - 1, and return 0 if it overflows. I ended up putting this 
// condition checker in the while loop, and since we can't tell once if total 
// overflows, I checked total against plus or minus (2^31 / 10) right before 
// we multiplied total by 10.

// Results:
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse 
// Integer.
// Memory Usage: 32.4 MB, less than 100.00% of Java online submissions for 
// Reverse Integer.
