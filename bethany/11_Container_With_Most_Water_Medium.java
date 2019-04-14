class Solution {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int maxArea = 0;
        while(p1 < p2){
            int width = p2 - p1;
            if(height[p1] < height[p2]){
                if(height[p1] * width > maxArea){
                    maxArea = height[p1] * width;
                }
                p1++;
            }
            else{
                if(height[p2] * width > maxArea){
                    maxArea = height[p2] * width;
                }
                p2--;
           
            }
        }
        return maxArea;
    }
}

//Results:
//Runtime: 1 ms, faster than 100.00% of Java online submissions for Container With Most Water.
//Memory Usage: 40.2 MB, less than 69.76% of Java online submissions for Container With Most Water.
