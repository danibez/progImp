package matriz;

import java.util.Scanner;

public class MatrixNota {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int[][] mat = new int[n][3];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = s.nextInt();
            }
        }

        int soma;
        for (int i = 0; i < mat.length; i++) {
            soma = 0;
            for (int j = 0; j < mat[i].length; j++) {
                soma = soma + mat[i][j];
            }
            System.out.println(soma/3.0);
        }
    }
}
