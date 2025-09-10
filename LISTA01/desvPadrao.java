package LISTA01;

public class desvPadrao {

    public static double media(int[] v){
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma/10.0;
    }

    public static void main(String[] args) {
        int v[] = {1,4,5,4,5,7,1,5,2,4};
        double m = media(v);
        
        double somatorio = 0;
        for (int i = 0; i < 10; i++) {
            somatorio += Math.pow((v[i] - m),2);
        }
        System.out.println(Math.sqrt((1/9.0)*somatorio));
    }
}

