package classes;

import java.util.Scanner;

class Carro{
    String placa;
    String marca;
    int ano;
}

class Pessoa{
    String nome;
    int idade;
    String cpf;
    Carro carro;
}

public class MyClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Carro[] carros = new Carro[2];
        Pessoa pessoa = new Pessoa();

        pessoa.cpf = "123456789";
        pessoa.idade = 25;
        pessoa.nome = "fulano";
        pessoa.carro = new Carro();
        pessoa.carro.placa = "kei1234";
        pessoa.carro.marca = "fiat";
        pessoa.carro.ano = 2012;

        for (int i = 0; i < carros.length; i++) {
            System.out.println("Carro " + i);
            carros[i] = new Carro();
            System.out.print("Placa: ");
            carros[i].placa = s.next();
            System.out.print("Marca: ");
            carros[i].marca = s.next();
            System.out.print("ano: ");
            carros[i].ano = s.nextInt();
        }
        System.out.println("\n==============\n");
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Carro " + i);
            System.out.println(carros[i].placa);
            System.out.println(carros[i].marca);
            System.out.println(carros[i].ano);
        }

    }
}
