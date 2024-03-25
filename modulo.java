import java.util.Scanner;

public class modulo {
    public static int soma(int a, int b){
        int resultado = a+b;
        return resultado;
    }

    public static void dados(String nome, int idade, float renda){
        System.out.println("======DADOS====");
        System.out.println("Nome: "+ nome + "\nidade: " + idade + "\nrenda: " + renda);
        System.out.println("======DADOS====");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        int id = s.nextInt();
        float renda = s.nextFloat();
        System.out.println("======MAIN====");
        dados(n, id, renda);
        System.out.println("======MAIN====");
        System.out.println("dknksudhsd");
        int x = soma(id, 3);
        dados(n, x, renda);
        s.close();
    }
}
