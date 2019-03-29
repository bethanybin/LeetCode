class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] toReturn = new int[M.length][M[0].length];
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[i].length; j++){
                int numPixels = 0;
                int totalPixels = 0;
                for(int ix = i - 1; ix < i + 2; ix++){
                    for(int jx = j - 1; jx < j + 2; jx++){
                        if(inRange(M, ix, jx)){
                            totalPixels += M[ix][jx];
                            numPixels++;
                        }
                    }
                }
                if(numPixels != 0){
                    toReturn[i][j] = (totalPixels/numPixels);
                }
                else{
                    toReturn[i][j] = M[i][j];
                }
            }
        }
        return toReturn;
    }
    public static boolean inRange(int[][] M, int i, int j){
        return (i >= 0 && j >= 0) && (i < M.length && j < M[0].length);
    }
}
