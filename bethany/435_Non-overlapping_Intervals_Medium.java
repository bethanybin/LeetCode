class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int toReturn = 0;
        int currEnd = Integer.MAX_VALUE;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        if(intervals.length > 0){
            currEnd = intervals[0][1];
        }
        for(int i = 1; i < intervals.length; i++){
            if(currEnd > intervals[i][0]){
                toReturn++;
                currEnd = Math.min(currEnd, intervals[i][1]);
            }
            else{
                currEnd = intervals[i][1];
            }
        }
        return toReturn;
    }
}

//Results:
//Runtime: 35 ms, faster than 27.01% of Java online submissions for Non-overlapping Intervals.
//Memory Usage: 35.3 MB, less than 88.19% of Java online submissions for Non-overlapping Intervals.

