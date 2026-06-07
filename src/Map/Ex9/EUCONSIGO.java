package Map.Ex9;

import Map.Ex9.entities.PontuacaoEx8;
import Map.Ex9.entities.UsuarioEx6;

import java.util.ArrayList;
import java.util.HashMap;
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



        /* EXERCICIO 8*/
        PontuacaoEx8 pontuacao = new PontuacaoEx8();

        pontuacao.adicionarPontos("Ana", 5);
        pontuacao.adicionarPontos("Ana", 10);
        pontuacao.adicionarPontos("Pedro", 7);

        pontuacao.listar();


    }
}
