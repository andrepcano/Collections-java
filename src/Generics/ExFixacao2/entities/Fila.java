package Generics.ExFixacao2.entities;

import Generics.ExFixacao2.services.Identificavel;

import java.util.ArrayList;
import java.util.List;

public class Fila <T extends Identificavel>{

    List<T> list = new ArrayList<>();

    public void entrar(T item) {
        list.add(item);
    }

    public T chamarProximo() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista esta vazia!");
        }

        return list.remove(0);
    }

    public T espiarProximo() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista esta vazia!");
        }

        return list.get(0);
    }


    public boolean contemId(String id) {
        for (T item : list) {
            if (item.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return list.size();
    }

    public boolean estaVazia() {
        return list.isEmpty();
    }
}
