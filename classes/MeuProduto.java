// Crie uma classe chamada Produto que representa
// um produto em uma loja. A classe Produto deve ter
// os seguintes atributos:
// - nome (String): o nome do produto.
// - codigo (int): o código do produto.
// - preco (double): o preço do produto.
// Crie três objetos da classe Produto.
// Armazene esses objetos em um vetor de Produto.
// Percorra o vetor e imprima os detalhes
// de cada produto.

package classes;

class Produto {
    String nome;
    int codigo;
    double preco;
}

public class MeuProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        Produto[] produtos = new Produto[3];
        Produto[] produtos2 = new Produto[3];

        p1.nome = "creme dental";
        p1.codigo = 123;
        p1.preco = 2.50;

        p2.nome = "carne";
        p2.codigo = 456;
        p2.preco = 30.99;

        p3.nome = "detergente";
        p3.codigo = 789;
        p3.preco = 10.00;

        produtos[0] = p1;
        produtos[1] = p2;
        produtos[2] = p3;

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i].nome);
            System.out.println(produtos[i].codigo);
            System.out.println(produtos[i].preco);
            System.out.println("===========");
        }
        
    }
}
