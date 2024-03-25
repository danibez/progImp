import java.util.Scanner;

/**
 * array
 */
public class array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] orig = new int[10];
        int[] quad = new int[10];

        for(int i = 0; i < orig.length; i++){
            orig[i] = s.nextInt();
        }

        for(int i = 0; i < quad.length; i++){
            quad[i] = orig[i] * orig[i];
        }

        for(int i = 0; i < quad.length; i++)
        {
            System.out.println(i + " " + orig[i] + " " + quad[i]);
        }

    }
}