package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * WriteFile
 */
public class WriteFile {

    public static void main(String[] args) {
        try {
            
            FileWriter myWriter = new FileWriter("teste.html");
            myWriter.write("ALOOO");
            myWriter.close();

          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
    }
}