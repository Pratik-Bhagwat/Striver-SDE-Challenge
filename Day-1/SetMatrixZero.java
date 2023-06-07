/*
    Question: Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

    You must do it in place.
    
 */
public class SetMatrixZero {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(row[i] == -1 || col[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}