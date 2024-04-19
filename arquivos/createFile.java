package arquivos;

import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        File myFile = new File("teste.txt"); // Specify the filename
        System.out.println(myFile.getAbsolutePath());
    }
}