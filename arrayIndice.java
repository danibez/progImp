import java.util.Scanner;

public class arrayIndice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] elemento = new int[10];
        int[] fim = new int[10];

        for (int i = 0; i < 10; i++) {
            elemento[i] = s.nextInt();
        }

        for (int i = 0; i < elemento.length; i++) {
            if(i%2 == 0)
                fim[i] = elemento[i]/2;
            else
                fim[i] = elemento[i]*3;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(elemento[i] + " " + fim[i]);
        }
    }
}
