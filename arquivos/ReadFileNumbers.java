import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileNumbers {
    public static void main(String[] args) {
        String temp;
        File file = new File("numeros.txt");
        Scanner s;
        try {
            s = new Scanner(file);
            while (s.hasNextLine()) {
                temp = s.nextLine();
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
