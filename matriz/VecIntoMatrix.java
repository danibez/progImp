package matriz;

public class VecIntoMatrix {
    
    public static int verifica(int[][] m, int[] v){
        int k = 0, n = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j] == v[k]){
                    k++;
                    if (k == v.length) {
                        n++;
                        k = 0;
                    }
                }
                else 
                    k = 0;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[][] mat = {
                     {1, 2, 3, 4, 5, 2, 3, 6, 3, 5},
                     {4, 5, 6, 8, 2, 3, 1, 3, 4, 5},
                     {7, 8, 9, 7, 4, 5, 3, 2, 2, 2}
                    };

        int []v = {4,5};

        System.out.println(verifica(mat, v));
    }
}
