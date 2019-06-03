class CellGrid{
    int x;
    int y;
    public CellGrid(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        Queue<CellGrid> queue = new LinkedList<>();
        int numIslands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    queue.add(new CellGrid(i, j));
                    grid[i][j] = 0;
                    numIslands++;
                    while(queue.size() != 0){
                        CellGrid currCell = queue.poll();
                        int x = currCell.x;
                        int y = currCell.y;
                        if(inRange(x, y-1, grid)){
                            if(grid[x][y-1] == '1'){
                                queue.add(new CellGrid(x, y-1));
                                grid[x][y-1] = '0';
                            }
                        }
                        if(inRange(x, y+1, grid)){
                            if(grid[x][y+1] == '1'){
                                queue.add(new CellGrid(x, y+1));
                                grid[x][y+1] = '0';
                            }
                        }
                        if(inRange(x-1, y, grid)){
                            if(grid[x-1][y] == '1'){
                                queue.add(new CellGrid(x-1, y));
                                grid[x-1][y] = '0';
                            }
                        }
                        if(inRange(x+1, y, grid)){
                            if(grid[x+1][y] == '1'){
                                queue.add(new CellGrid(x+1, y));
                                grid[x+1][y] = '0';
                            }
                        }
                    }
                }
            }
        }
        return numIslands;
    }
    public boolean inRange(int x, int y, char[][] grid){
        return (x > -1 && x < grid.length) && (y > -1 && y < grid[x].length);
    }
}

//Results:
//Runtime: 5 ms, faster than 18.45% of Java online submissions for Number of Islands.
//Memory Usage: 39.6 MB, less than 99.84% of Java online submissions for Number of Islands.


//Afterthoughts: the runtime couldve been improved with the queue but instead we could've done a recurisve call on each cell looking for 1s around it
