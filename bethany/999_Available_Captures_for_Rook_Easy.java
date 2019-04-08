class Solution {
    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'R'){
                    x = i;
                    y = j;
                }
            }
        }
        int toReturn = 0;
        int up = y - 1;
        int down = y + 1;
        int left = x - 1;
        int right = x + 1;
        while(up >= 0){
            if(board[x][up] != '.'){
                if(board[x][up] == 'p'){
                    toReturn++;
                }
                break;
            }
            up--;
        }
        while(down <= 7){
            if(board[x][down] != '.'){
                if(board[x][down] == 'p'){
                    toReturn++;
                }
                break;
            }
            down++;
        }
        while(left >= 0){
            if(board[left][y] != '.'){
                if(board[left][y] == 'p'){
                    toReturn++;
                }
                break;
            }
            left--;
        }
        while(right <= 7){
            if(board[right][y] != '.'){
                if(board[right][y] == 'p'){
                    toReturn++;
                }
                break;
            }
            right++;
        }
        return toReturn;
        
        
    }
    
}
//Results:
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Available Captures for Rook.
//Memory Usage: 35.4 MB, less than 100.00% of Java online submissions for Available Captures for Rook.
