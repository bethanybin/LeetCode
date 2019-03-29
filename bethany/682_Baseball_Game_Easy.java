class Solution {
    public int calPoints(String[] ops) {
        int score = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < ops.length; i++){
            try{
                Integer.parseInt(ops[i]);
                score += Integer.parseInt(ops[i]);
                stack.push(Integer.parseInt(ops[i]));
            }
            catch(NumberFormatException ex){ 
                if(ops[i].equals("+")){
                    //for the most recent score
                    int firstScore = 0;
                    int secondScore = 0;
                    if(checkStack(stack)){
                        firstScore = stack.pop();
                    }
                    //for the second more recent score
                    if(checkStack(stack)){
                        secondScore = stack.peek();
                    }
                    score += (firstScore + secondScore);
                    if(firstScore != 0){
                        stack.push(firstScore);
                    }
                    stack.push(firstScore + secondScore);
                }
                else if(ops[i].equals("D")){
                    if(checkStack(stack)){
                        int tempScore = 2 * stack.peek();
                        score += (tempScore);
                        stack.push(tempScore);
                    }
                }
                else if(ops[i].equals("C")){
                    if(checkStack(stack)){
                        score -= (stack.pop());
                    }
                }
                
            }
            System.out.println(score);
        }
        return score;
    }
    
    public static boolean checkStack(Stack<Integer> stack){
        return !stack.empty() && stack.peek() != null;
    }
    
