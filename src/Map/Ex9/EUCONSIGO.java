package Map.Ex9;

import Map.Ex9.entities.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EUCONSIGO {
    static void main() {

        /* EXERCICIO 1
        Integer[] numeros = {1, 2, 1, 3, 2, 1, 4};
        Map<Integer, Integer> mapa = new HashMap<>();

        for(int numero : numeros) {
            mapa.put(numero, mapa.getOrDefault(numero, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/



        /* EXERCICIO 2
        String texto = "abacaxi";
        Map<Character, Integer> mapa = new HashMap<>();

        for (char letra : texto.toCharArray()) {
            mapa.put(letra, mapa.getOrDefault(letra, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/



        /* EXERCICIO 3
        List<String> palavras =
                List.of("java", "map", "lista", "set", "api");

        Map<Integer, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            int tamanho = palavra.length();
            frequencia.put(tamanho, frequencia.getOrDefault(tamanho, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/



        /* EXERCICIO 4
        CadastroEx4 cadastro = new Cadastro();

        cadastro.adicionar("Ana");
        cadastro.adicionar("Pedro");
        cadastro.adicionar("Ana");

        cadastro.listar();*/



        /* EXERCICIO 5
        AgendaEx5 agenda = new Agenda();

        agenda.adicionar("André", "11976336418");
        agenda.adicionar("Nilza", "11994508321");
        agenda.adicionar("André", "11976336418");

        System.out.println("\nAgedna Inicial: ");
        agenda.listar();

        System.out.println("\nBuscando Telefone de Nilza: ");
        System.out.println(agenda.buscarTelefone("Nilza"));



        agenda.remover("André");
        System.out.println("\nagenda depois de remover André: ");
        agenda.listar();*/



        /* EXERCICIO 6
        UsuarioEx6 cadastro = new UsuarioEx6();
        cadastro.cadastrar("André", "140408");

        System.out.println(cadastro.autenticar("Lucia", "233"));
        System.out.println(cadastro.autenticar("André", "140408"));*/



        /* EXERCICIO 7
        String[] votos = {"Ana", "Pedro", "Ana", "Carlos", "Ana", "Pedro"};
        Map<String, Integer> contagem = new HashMap<>();

        for (String nome : votos) {
            contagem.put(nome, contagem.getOrDefault(nome, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/



        /* EXERCICIO 8
        PontuacaoEx8 pontuacao = new PontuacaoEx8();

        pontuacao.adicionarPontos("Ana", 5);
        pontuacao.adicionarPontos("Ana", 10);
        pontuacao.adicionarPontos("Pedro", 7);

        pontuacao.listar();*/



        /* EXERCICIO 9
        EstoqueEx9 estoqueEx9 = new EstoqueEx9();

        estoqueEx9.adicionar("Notebook", 10);
        estoqueEx9.adicionar("Mouse", 5);
        estoqueEx9.adicionar("Teclado", 2);

        System.out.println("Estoque antes da venda: ");
        estoqueEx9.listar();

        estoqueEx9.venderProdutos("Notebook", 4);
        System.out.println("Estoque apos a venda!");
        estoqueEx9.listar();*/



        /* EXERCICIO 10
        List<String> list = List.of("Ana", "Alice", "Bruno", "Beatriz", "Carlos");
        Map<Character, List<String>> map = new HashMap<>();

        for (String nome : list) {
            char inicial = nome.charAt(0); // pega a inicial de todas as palavras da lista
            map.computeIfAbsent(inicial, k -> new ArrayList<>())
                    .add(nome);
        }

        for (Map.Entry<Character, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/



        /* EXERCICIO 11
        List<ProdutosEx11> list = List.of(
                new ProdutosEx11("Notebook", "Eletrônicos"),
                new ProdutosEx11("Mouse", "Eletrônicos"),
                new ProdutosEx11("Arroz", "Alimentos"));

        Map<String, List<String>> categorias = new HashMap<>();

        for (ProdutosEx11 produtos : list) {
            categorias.computeIfAbsent(produtos.getCategoria(),k -> new ArrayList<>())
                    .add(produtos.getNome());
        }

        for (Map.Entry<String, List<String>> entry : categorias.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/



        /* EXERCICIO 12
        List<AlunosEx12> alunos = List.of(
                new AlunosEx12("Ana", 'A'),
                new AlunosEx12("Pedro", 'A'),
                new AlunosEx12("Carlos", 'B'));

        Map<Character, List<String>> map = new HashMap<>();

        for (AlunosEx12 aluno : alunos) {
            map.computeIfAbsent(aluno.getTurma(), k -> new ArrayList<>())
                    .add(aluno.getNome());
        }

        for (Map.Entry<Character, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/



        /* EXERCICIO 13
        List<String> palavras = List.of("java", "map", "java", "lista", "java");
        Map<String, Integer> map = new HashMap<>();

        for (String palavra : palavras) {
            map.put(palavra, map.getOrDefault(palavra, 0) + 1);
        }

        String maisRepetida = "";
        int maior = 0;




        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
                maisRepetida = entry.getKey();
            }
        }

        System.out.println("Mais Repetida: " + maisRepetida);
        System.out.println("Quantidade: " + maior);*/



        /* EXERCICIO 14
        String palavra = "banana";
        Map<Character, Integer> map = new HashMap<>();

        for (char letra : palavra.toCharArray()) {
            map.put(letra, map.getOrDefault(letra, 0) + 1);
        }
        
        Character maisRepetida = null;
        Integer maisVezes = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maisVezes) {
                maisVezes = entry.getValue();
                maisRepetida = entry.getKey();
            }
        }

        System.out.println("Mais repetida: " + maisRepetida + " -> " + maisVezes);*/



        /* EXERCICIO 15*/
        EstoqueEx15 estoqueEx15 = new EstoqueEx15();
        Map<String, Integer> map = new HashMap<>();

        map.put("Notebook", 10);
        map.put("Mouse", 5);
        map.put("Teclado", 20);

        System.out.println(estoqueEx15.maiorEstoque(map));


    }
}
