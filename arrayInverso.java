import java.util.Scanner;

public class arrayInverso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] elementos = new int[10];
        int[] inverso = new int[10];

        for (int i = 0; i < 10; i++) {
            elementos[i] = s.nextInt();
        }

        for(int i = 9; i >= 0; i--){
            inverso[i] = elementos[10 - i - 1];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(elementos[i] + " " + inverso[i]);
        }
    }
}
