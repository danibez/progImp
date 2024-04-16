package matriz;

public class MatrixSoma {

    public static int[][] somaMatrix(int[][] A, int[][] B){
        int[][] C = new int[2][2];
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1,2},
            {3,4}
        };

        int[][] B = {
            {2,4},
            {5,6}
        };

        int[][] C = new int[2][2];

        C = somaMatrix(A, B);

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
