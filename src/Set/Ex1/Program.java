package Set.Ex1;

import java.util.HashSet;
import java.util.Set;

public class Program {
    static void main(String[] args) {

        // muito rapido mas nao mantem a ordem
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        System.out.println(set.contains("Notebook"));
        set.remove("Tablet");

        // forma de remover com condição
        set.removeIf(x -> x.length() >= 3);

        for (String p : set) {
            System.out.println(p);
        }
    }
}
