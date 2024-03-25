import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int idade;
        int soma = 0;
        int quant = s.nextInt();
        for (int i = 0; i < quant; i++) {
            idade = s.nextInt();
            soma = soma + idade;
        }
        System.out.println(soma/quant);
    }
}
