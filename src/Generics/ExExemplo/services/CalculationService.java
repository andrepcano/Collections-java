package Generics.ExExemplo.services;

import java.util.List;

public class CalculationService {

    //Esse metodo trabalha com qualquer tipo ou superclasse de T, DESDE QUE esse tipo saiba se comparar
    public static <T extends  Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List cant be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
