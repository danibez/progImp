package matriz;

public class MatrixNotSquared {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3,10,20},
            {4,5,6,11,30,100},
            {7,8,9,12,40}
        };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");      
            }
            System.out.println();
        }

    }
}
