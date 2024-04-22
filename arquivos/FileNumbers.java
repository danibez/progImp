import java.io.FileWriter;
import java.io.IOException;

public class FileNumbers {
    public static void main(String[] args) {
        FileWriter fw;
        try {
            fw = new FileWriter("numeros.txt");
            for (int i = 0; i < 100; i++) {
                fw.write(i + "\n" );
            }
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
