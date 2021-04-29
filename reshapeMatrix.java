class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int cols = nums[0].length;
        
        if ((rows * cols) != (r * c)){
            return nums;
        }
        
        int[][] output = new int[r][c];
        int rowIndex = 0;
        int colIndex = 0;
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                output[rowIndex][colIndex] = nums[i][j];
                colIndex++;
                if(colIndex == c){
                    colIndex = 0;
                    rowIndex++;
                }
            }
        }
        return output;
    }
}