package outros;

public class FibonacciIterativo {

    public static void main(String[] args) {
        int n = 48; // Número de termos da sequência a serem gerados
        gerarFibonacci(n);
    }

    public static void gerarFibonacci(long n) {
        // Casos base para os primeiros termos da sequência
        if (n < 1) {
            System.out.println("O número de termos deve ser pelo menos 1.");
            return;
        }

        long num1 = 0; // Primeiro número da sequência
        long num2 = 1; // Segundo número da sequência

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + (i == n ? "" : " ")); // Imprime o número atual

            // Calcula o próximo número da sequência
            long proximoNum = num1 + num2;
            num1 = num2;
            num2 = proximoNum;
        }
        System.out.println(); // Nova linha no final
    }
}