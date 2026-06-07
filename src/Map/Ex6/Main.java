package Map.Ex6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 9);
        notas.put("Bruno", 7);
        notas.put("Carlos", 8);

        Map<Integer, String> notasInvertidas = new HashMap<>();

        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            notasInvertidas.put(entry.getValue(), entry.getKey());
        }

        System.out.println(notasInvertidas);
    }
}
