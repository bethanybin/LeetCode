class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < emails.length; i++){
            int atIndex = atIndex(emails[i]);
            String end = emails[i].substring(atIndex, emails[i].length());
            String beg = emails[i].substring(0, atIndex);
            String newBeg = beg.replace(".", "");
            int plusIndex = plusIndex(newBeg);
            if(plusIndex != -1){
                String noPlus = newBeg.substring(0, plusIndex);
                String finalPlus = noPlus + end;
                System.out.println("if " + finalPlus);
                set.add(finalPlus);
            }
            else{
                String finalNoPlus = newBeg + end;
                System.out.println(finalNoPlus);
                set.add(finalNoPlus);
            }
        }
        return set.size();
    }
    
    public int plusIndex(String s){
        int index = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '+'){
                index = i;
                break;
            }
        }
        return index;
    }
    
    public int atIndex(String s){
        int index = -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '@'){
                index = i;
                break;
            }
        }
        return index;
    }
}

//Afterthoughts:
//FORGOT THERE IS AN INDEXOF FUNCTION IN JAVA SO I WROTE MY OWN

//Results:
//Runtime: 53 ms, faster than 12.80% of Java online submissions for Unique Email Addresses.
//Memory Usage: 40 MB, less than 33.16% of Java online submissions for Unique Email Addresses.
