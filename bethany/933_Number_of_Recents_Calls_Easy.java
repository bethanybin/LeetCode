class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}

//Results:
//Runtime: 72 ms, faster than 98.14% of Java online submissions for Number of Recent Calls.
//Memory Usage: 66.3 MB, less than 11.51% of Java online submissions for Number of Recent Calls.

