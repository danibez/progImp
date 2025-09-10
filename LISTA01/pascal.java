package LISTA01;

import java.util.Scanner;

public class pascal {

    public static long fatorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(fatorial(i)/(fatorial(k)*fatorial(i-k)) + " ");
            }
            System.out.println();
        }
    }
}
