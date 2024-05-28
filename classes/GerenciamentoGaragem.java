// - Criar a classe Carro que contém:
//      - marca (string)
//      - placa (string)
//      - ano (int)
// - Criar a classe Garagem que contém:
//      - id (string)
//      - carro[] (Carro)
// - Criar um objeto garagem que tem dois carros

package classes;

import java.util.Scanner;

class Carro{
    String placa;
    String marca;
    int ano;
}

class Garagem{
    String id;
    Carro carro[];
}

public class GerenciamentoGaragem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Garagem garagem = new Garagem();
        garagem.id = "123";
        garagem.carro = new Carro[10];

        for (int i = 0; i < garagem.carro.length; i++) {
            garagem.carro[i] = new Carro();
            garagem.carro[i].ano = s.nextInt();
            garagem.carro[i].marca = s.next();
            garagem.carro[i].placa = s.next();
        }

        System.out.println("===================");
        for (int i = 0; i < garagem.carro.length; i++) {
            System.out.println(garagem.carro[i]);
            System.out.println(garagem.carro[i].ano);
            System.out.println(garagem.carro[i].marca);
            System.out.println(garagem.carro[i].placa);
        }

        // garagem.carro[0] = new Carro();
        // garagem.carro[0].ano = 2020;
        // garagem.carro[0].marca = "fiat";
        // garagem.carro[0].placa = "asd1234";

        // garagem.carro[1] = new Carro();
        // garagem.carro[1].ano = 2023;
        // garagem.carro[1].marca = "fiat";
        // garagem.carro[1].placa = "zxc9874";

    }
}