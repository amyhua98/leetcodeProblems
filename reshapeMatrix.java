class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] array = new int[r][c];
        if(mat.length * mat[0].length != array.length * array[0].length)
            return mat;
        
        int[] tmp = new int[mat.length * mat[0].length];
        int j = 0;
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[0].length; col++){
                tmp[j] = mat[row][col];
                j++;
            }
        }
        int i = 0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[0].length; col++){
                array[row][col] = tmp[i];
                i++;
            }
        }
        return array;
    }
}