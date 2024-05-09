public class BuscaSequencial {
    public static void main(String[] args) {
        int[] lista = {2,5,2,7,9,4,6,8,3,6,8,3,10};
        int n = 3;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == n) {
                System.out.println("Numero " + n + " encontrado na posicao " + i);
                break;
            }
        }
    }
}
