class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
        
    }
}
//Results:
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Two Integers.
//Memory Usage: 31.8 MB, less than 100.00% of Java online submissions for Sum of Two Integers.
