package Generics.Ex2.services;

import java.util.List;

public class MaxService {

    public static <T extends Comparable<? super T>> T max(List<T> list) {
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

    public static void imprimirLista(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
