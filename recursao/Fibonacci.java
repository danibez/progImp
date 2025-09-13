package recursao;

import java.util.Scanner;

public class Fibonacci {

    public static long fib(int n){
        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else
            return fib(n-2) + fib(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o n-ésimo valor da sequencia de fibonacci: ");
        int n = s.nextInt();
        System.out.println("O valor é " + fib(n));
    }
}
