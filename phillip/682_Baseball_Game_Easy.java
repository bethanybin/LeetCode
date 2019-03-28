// 682. Baseball Game - Easy

// Initial thoughts:
// This problem is easily done with a single iteration through the list with 
// O(n) runtime. Keep an aggregator variable to keep track of the current 
// score, and everytime an instruction comes in just modify that score. We 
// shouldn't have to worry about getting any invalid instructions, and parsing 
// strings to convert to an int is easy in Java.

// Implementation:

class Solution {
    public int calPoints(String[] ops) {
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        int temp = 0;
        for (int i = 0; i < ops.length; i++) {
            String str = ops[i];
            if (str.equals("D")) {
                temp = (2 * list.get(list.size() - 1));
                sum = sum + temp;
                list.add(temp);
                continue;
            }
            if (str.equals("C")) {
                temp =  list.get(list.size() - 1);
                sum = sum - temp;
                list.remove(list.size() - 1);
                continue;
            }
            if (str.equals("+")) {
                temp = list.get(list.size() - 1) + list.get(list.size() - 2);
                sum = sum + temp;
                list.add(temp);
                continue;
            }
            temp = Integer.parseInt(str);
            sum = sum + temp;
            list.add(temp);
        }
        return sum;
    }
}

// Afterthoughts:
// One thing that I hadn't considered was the fact that you would need to 
// update the values of the last variables for each iteration. Another major 
// thing to consider is that instead of simply remember the last two values 
// for the "+" instruction, I had to keep an ArrayList of all the entered 
// values in the case that the "C" instruction is called more than once 
// consecutively. This results the there being no 2nd last valid value, so 
// you must use an ArrayList to keep track of what was entered. The other 
// bugs that I ran into were basic Java things. First, I hadn't realized the 
// input was an array and not a list, so the size() and get() methods 
// wouldn't work.Secondly, I had forgotten to use .equals() for string 
// comparisons, and using == compares the memory addresses of strings rather 
// than logical equality. Thirdly, I had mistakenly used break instead of 
// continue at the end of each conditional check. Break breaks out of the 
// whole for loop, and continue continues onto the next iteration. In this 
// case we want the functionality of continue, not break. 

// Results:
// Runtime: 2 ms, faster than 99.96% of Java online submissions for Baseball 
// Game.
// Memory Usage: 37.2 MB, less than 58.71% of Java online submissions for 
// Baseball Game.
