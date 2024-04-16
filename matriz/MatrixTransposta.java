package matriz;

public class MatrixTransposta {
    public static void main(String[] args) {
        int[][] A = {
            {1,4},
            {2,5},
            {3,6},
        };

        int[][] B = new int[2][3];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = A[j][i];
            }
        }

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

    }
}
