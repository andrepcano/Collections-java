package Map.Ex3;

import java.util.HashMap;
import java.util.Map;

public class ContPalavras {
    static void main() {


        String[] palavras = {"java", "map", "java", "lista", "map", "java"};
        Map<String, Integer> map = new HashMap<>();

        for (String palavra : palavras) {
            map.put(palavra, map.getOrDefault(palavra, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
