import java.util.Hashtable;
class Solution {
    public int findPairs(int[] nums, int k) {
        Hashtable<Integer, Integer> values = new Hashtable<Integer, Integer>();
        int counter = 0;
        boolean found = false;
        if(k == 0){
            for(int i = 0; i < nums.length; i++){
                if(values.containsKey(nums[i])){
                    if(!found){
                        counter++;
                        found = true;
                    }
                }
                else{
                    values.put(nums[i], i);
                    found = false;
                }
                System.out.println(i + " " + found);
            }
        }
        else if(k < 0){
            return 0;
        }
        else{
            for(int i = 0; i < nums.length; i++){
            values.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++){
            System.out.println(values.size());
            int neg = nums[j] - k;
            int pos = nums[j] + k;
            if(!values.containsKey(nums[j])){
                continue;
            }
            if(values.containsKey(neg)){
                System.out.println("negative");
                counter++;
            }
            if(values.containsKey(pos)){
                System.out.println("positive");
                counter++;
            }
            values.remove(nums[j]);
            if(values.size() == 1){
                break;
            }
        }
        }
        return counter;
    }
}
