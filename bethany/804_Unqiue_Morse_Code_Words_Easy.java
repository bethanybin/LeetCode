class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < words.length; i++){
            StringBuilder morseString = new StringBuilder();
            for(int j = 0; j < words[i].length(); j++){
                morseString.append(morse[words[i].charAt(j) - 'a']);
            }
            set.add(morseString.toString());
        }
        return set.size();
    }
}

//Results:
//Runtime: 2 ms, faster than 98.83% of Java online submissions for Unique Morse Code Words.
//Memory Usage: 36.8 MB, less than 84.60% of Java online submissions for Unique Morse Code Words.

