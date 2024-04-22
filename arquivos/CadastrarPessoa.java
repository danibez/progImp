import java.io.FileWriter;
import java.util.Scanner;

public class CadastrarPessoa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome, snome, email;
        try {
            FileWriter fw = new FileWriter("pessoas.csv");
            fw.write("Nome,Sobrenome,email\n");
            System.out.println("Deseja cadastrar uma pessoa?\nSim - 1\nNão - 0");
            int op = s.nextInt();
            while (op != 0) {
                System.out.println("Digite o nome");
                nome = s.next();
                System.out.println("Digite o sobrenome");
                snome = s.next();
                System.out.println("Digite o email");
                email = s.next();
                fw.write(nome + "," + snome + "," + email+"\n");
                System.out.println("Deseja cadastrar uma pessoa?\nSim - 1\nNão - 0");
                op = s.nextInt();
            }
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
