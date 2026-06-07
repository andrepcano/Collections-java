package Map.Ex7;

import Generics.Ex1.entities.Notebook;
import Map.Ex7.entities.Product;

public class Main {
    static void main() {

        Product estoque = new Product();

        estoque.adicionar("Notebook", 10);
        estoque.adicionar("Mouse", 5);
        estoque.adicionar("Teclado", 2);

        System.out.println("Estoque inicial:");
        estoque.listarTodos();


        estoque.venderProdutos("Notebook", 7);
        estoque.venderProdutos("Teclado", 2);

        System.out.println("Estoque final:");
        estoque.listarTodos();

        System.out.println("\nProdutos abaixo de 5 unidades:");
        estoque.produtosAbaixo(5);
    }
}
