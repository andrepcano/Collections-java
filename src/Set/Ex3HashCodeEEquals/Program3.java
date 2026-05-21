package Set.Ex3HashCodeEEquals;

import Set.Ex3HashCodeEEquals.entities.Product3;

import java.util.HashSet;
import java.util.Set;

public class Program3 {
    static void main(String[] args) {

        Set<Product3> set = new HashSet<>();

        set.add(new Product3("TV", 900.0));
        set.add(new Product3("Notebook", 1200.0));
        set.add(new Product3("Tablet", 400.0));

        Product3 prod = new Product3("Notebook", 1200.0);

        System.out.println(set.contains(prod));
    }
}
