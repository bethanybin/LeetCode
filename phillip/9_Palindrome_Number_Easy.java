// 9. Palindrome Number - Easy

// Initial thoughts: 
// Seems to be easily accomplished by parsing the int as a string and then 
// testing the string for palindrome. To do this without a string is much 
// harder. Have to take into account cases like: 
//   *  Negative numbers will always be false
//   *  Single digit numbers will always be true
//   *  Multiples of 11 will always be true

// Implementation:

class Solution {
  public boolean isPalindrome(int x) {
    String strx = "" + x;
    int i = 0;
    int strlen = strx.length() - 1;
    for (i = 0; i <= strlen / 2; i++) {
      if (strx.charAt(i) != strx.charAt(strlen - i)) {
        return false;
      }
    }
    return true;
  }
}


// Afterthoughts:
// Gave up on trying to do this without parsing the int as a string after I 
// realized that we still have to take into account numbers like 313 that are 
// not multiples of 11.

// Results:
// Runtime: 8 ms, faster than 99.62% of Java online submissions for Palindrome 
// Number.
// Memory Usage: 34.7 MB, less than 100.00% of Java online submissions for 
// Palindrome Number.
