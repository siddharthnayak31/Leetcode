class Solution {
    public void rotate(int[][] matrix) {

        //step 1 -> Transpose matrix.
            for(int i = 0; i<matrix.length-1; i++){
                for(int j=i+1; j<matrix.length; j++){
                    // swap(matrix[i][j],matrix[j][i]);
                    int temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }

            //step 2 -> reverse each row.
        for(int i=0 ; i<matrix.length;i++){
            int left = 0 ; int right = matrix.length-1;
            while(left<right){
                //swap and move towards center.
                int temp =  matrix[i][left];
                  matrix[i][left] =  matrix[i][right];
                  matrix[i][right] = temp;
                  //move
                  left++;right--;
            }
        }
    }
}