class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int columns = nums[0].length;
        
        if((rows * columns) != r * c){
            return nums;
        }
        
        int[][] output = new int[r][c];
        int rowNum = 0;
        int columnNum = 0;
        
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                output[rowNum][columnNum] = nums[i][j];
                columnNum++;
                if (columnNum == c){
                    columnNum = 0;
                    rowNum++;
                }
            }
        }
        return output;
    }
}