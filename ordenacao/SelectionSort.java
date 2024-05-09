public class SelectionSort {

    public static int[] selection_sort(int[] v, int n) { //n eh tamanho do vetor
        int i, j, min, aux;
        for (i = 0; i < (n-1); i++)
        {
            min = i;
            for (j = (i+1); j < n; j++) {
                if(v[j] < v[min])
                    min = j;
            }
            if (v[i] != v[min]) {
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
        }
        return v;
    }

    public static void main(String[] args) {
        int[] v = {3,5,7,2,4,1,6,9,8};
        
        int[] ordenado = selection_sort(v, v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println(ordenado[i]);
        }
    }
}
