package Map.Ex8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static void main() {

        List<String> nomes = List.of("Ana", "Bruno", "Alice", "Carlos", "Beatriz");

        Map<Character, List<String>> letras = new HashMap<>();

        for (String palavra : nomes) {

            for (char letra : palavra.toCharArray()) {
                letras.computeIfAbsent(letra, k -> new ArrayList<>())
                        .add(palavra);
            }
        }

        for (Map.Entry<Character, List<String>> entry : letras.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
