/**
 * InsertionSort
 */
public class InsertionSort {

    public static int[] insertion( int[] v, int n ){ //n eh tamanho do vetor
        int i, j= 1;
        int aux = 0;
        while (j < n)
        {
            aux = v[j];
            i = j - 1;
            while ((i >= 0) && (v[i] > aux))
            {
                v[i + 1] = v[i];
                i = i - 1;
            }
            v[i + 1] = aux;
            j = j + 1;
        }
        return v;
    }

    public static void main(String[] args) {
        int [] v = {3,6,3,7,9,4,2,5,8};

        int[] ordenado = insertion(v, v.length);
        for (int i = 0; i < ordenado.length; i++) {
            System.out.println(ordenado[i]);
        }
    }
}