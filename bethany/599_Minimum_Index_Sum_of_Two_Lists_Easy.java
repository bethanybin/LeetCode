class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int maxLength = Math.min(list1.length, list2.length);
        String[] toReturn = new String[maxLength];
        int curr = 1;
        int min = Integer.MAX_VALUE;
        int newLength = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int index = map.get(list2[i]);
                int currIndex = index + i;
                map.put(list2[i], currIndex);
                if(currIndex < min){
                    min = currIndex;
                    Arrays.fill(toReturn, "");
                    toReturn[0] = list2[i];
                    newLength = 1;
                }
                else if(currIndex == min){
                    toReturn[curr++] = list2[i];
                    newLength++;
                }
            }
        }
        String[] newReturn = new String[newLength];
        for(int i = 0; i < newLength; i++){
            newReturn[i] = toReturn[i];
        }
        return newReturn;
    }
}

//Results:
//Runtime: 8 ms, faster than 92.85% of Java online submissions for Minimum Index Sum of Two Lists.
//Memory Usage: 36.8 MB, less than 99.94% of Java online submissions for Minimum Index Sum of Two Lists.
