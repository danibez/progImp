package matriz;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j)
                    System.out.println(mat[i][j]);
                if (i+j == mat.length - 1)
                    System.out.println(mat[i][j]);
            }
        }

    }    
}