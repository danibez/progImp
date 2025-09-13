package outros;
import java.util.Scanner;

public class exercFunc {
    
    public static int afim(int a, int b, int x){
        return a*x + b;
    }

    public static double eq2g(int a, int b, int c, int x){
        return a*Math.pow(x, 2) + b*x + c;
    }

    public static int ehMaior(int a, int b){
        int maior;
        if (a > b){
            maior = a;
        } else{
            maior = b;
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (a!=b)
            System.out.println("O maior eh: " + ehMaior(a, b));
        else
            System.out.println("Os numeros sao iguais");            
    }
}
