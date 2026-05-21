package Generics.ExFixacao.entities;

import Generics.ExFixacao.services.Precificavel;

import java.util.ArrayList;
import java.util.List;

public class Estoque<T extends Precificavel> {

    List<T> itens = new ArrayList<>();

    public void adicionar(T item) {
        itens.add(item);
    }

    public T maisBarato() {
        if (itens.isEmpty()) {
            throw new IllegalStateException("Estoque vazio!");
        }
        T resultado = itens.get(0);
        for (T item : itens) {
            if (item.getPreco() < resultado.getPreco()) {
                resultado = item;
            }
        }
        return resultado;
    }

    public T maisCaro() { // era: maisCaro(T item) — não precisa de parâmetro
        if (itens.isEmpty()) {
            throw new IllegalStateException("Estoque vazio!");
        }
        T resultado = itens.get(0);
        for (T item : itens) {
            if (item.getPreco() > resultado.getPreco()) {
                resultado = item;
            }
        }
        return resultado;

    }

    public double precoMedio() {
        double soma = 0.0;
        for (T item : itens) {
            soma += item.getPreco(); // era: itens / itens.size() — não dá para dividir uma lista
        }

        return soma / itens.size();
    }
}
