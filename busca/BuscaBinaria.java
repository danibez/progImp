public class BuscaBinaria {
    public static void main(String[] args) {
        int[] lista = {1,3,5,6,8,9,10,13,16,20,33,34,36,47,48,59,60};
        int ini, meio, fim, obj = 45;
        ini = 0;
        fim = lista.length - 1;
        
        while (ini <= fim) {
            meio = (ini + fim)/2;
            if (lista[meio] == obj) {
                System.out.println("numero achado na posicao " + meio);
                break;
            }            
            else if (lista[meio] > obj) {
                fim = meio - 1;
            }else if (lista[meio] < obj){
                ini = meio + 1;
            }
        }
    }
}
