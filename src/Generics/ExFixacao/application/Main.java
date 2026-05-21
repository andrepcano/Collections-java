package Generics.ExFixacao.application;

import Generics.ExFixacao.entities.Eletronico;
import Generics.ExFixacao.entities.Estoque;
import Generics.ExFixacao.entities.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estoque<Livro> estoqueLivros = new Estoque<>();
        Estoque<Eletronico> estoqueEletronicos = new Estoque<>();

        System.out.println("Quantos Livros quer adicionar: ");
        int nL = sc.nextInt();

        for (int i = 1; i <= nL; i++) {
            System.out.println("Livro #" + i);
            sc.nextLine();
            System.out.println("Titulo: ");
            String titulo = sc.nextLine();
            System.out.println("Autor: ");
            String autor = sc.nextLine();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();

            Livro livros = new Livro(titulo, autor, preco);
            estoqueLivros.adicionar(livros);
        }


        System.out.println("Quantos Eletronicos quer adicionar: ");
        int nE = sc.nextInt();

        for (int i = 1; i <= nE; i++) {
            System.out.println("Eletronico #" + i);
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();

            Eletronico eletronicos = new Eletronico(nome, marca, preco);
            estoqueEletronicos.adicionar(eletronicos);
        }


        System.out.println("\n=== Estoque de Livros ===");
        System.out.printf("Mais barato: %s - R$ %.2f%n", estoqueLivros.maisBarato().getTitulo(), estoqueLivros.maisBarato().getPreco());
        System.out.printf("Mais caro: %s - R$ %.2f%n", estoqueLivros.maisCaro().getTitulo(), estoqueLivros.maisCaro().getPreco());
        System.out.printf("Média de preços: R$ %.2f%n", estoqueLivros.precoMedio());

        System.out.println("\n=== Estoque de Eletrônicos ===");
        System.out.printf("Mais barato: %s - R$ %.2f%n", estoqueEletronicos.maisBarato().getNome(), estoqueEletronicos.maisBarato().getPreco());
        System.out.printf("Mais caro: %s - R$ %.2f%n", estoqueEletronicos.maisCaro().getNome(), estoqueEletronicos.maisCaro().getPreco());
        System.out.printf("Média de preços: R$ %.2f%n", estoqueEletronicos.precoMedio());

        sc.close();
    }
}
