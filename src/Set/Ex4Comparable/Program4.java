package Set.Ex4Comparable;


import Set.Ex4Comparable.entities.Product4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program4 {
    static void main(String[] args) {

        // para o (TreeSet) ordenar seus objetos é necessario o uso de Comparable
        Set<Product4> set = new TreeSet<>();

        set.add(new Product4("TV", 900.0));
        set.add(new Product4("Notebook", 1200.0));
        set.add(new Product4("Tablet", 400.0));

        Product4 prod = new Product4("Notebook", 1200.0);

        for (Product4 product : set) {
            System.out.println(product);
        }
    }
}
