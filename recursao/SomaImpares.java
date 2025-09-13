package recursao;

import java.util.Scanner;

public class SomaImpares {

    public static int somaImpares(int n){
        if(n == 1)
            return 1;
        else
            return (2*n) - 1 + somaImpares(n-1);
    }

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("A soma dos " + n +  " primeiros inteiros impares é " + somaImpares(n));
    }
}
