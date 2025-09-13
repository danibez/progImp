package recursao;

import java.util.Scanner;

public class Fatorial {

    public static int fatorial(int n){
        if(n == 0)
            return 1;
        else
            return n * fatorial(n-1);
    }

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("O fatorial é " + fatorial(n));
    }
}
