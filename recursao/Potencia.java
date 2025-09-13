package recursao;

import java.util.Scanner;

public class Potencia {
    public static int pot(int x, int n){
        if(n == 0)
            return 1;
        else
            return x * pot(x, n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int x = s.nextInt();
        System.out.print("Digite o expoente: ");
        int n = s.nextInt();
        System.out.println(x + " elevado a " + n + " é " + pot(x, n));
    }
}
