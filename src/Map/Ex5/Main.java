package Map.Ex5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {

        String texto = "banana";
        Map<Character, Integer> frequencia = new HashMap<>();

        for(char letra : texto.toCharArray()) {
            frequencia.put(letra, frequencia.getOrDefault(letra, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
