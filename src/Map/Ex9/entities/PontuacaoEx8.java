package Map.Ex9.entities;

import java.util.HashMap;
import java.util.Map;

public class PontuacaoEx8 {
    private Map<String, Integer> jogador = new HashMap<>();

    public void adicionarPontos(String nome, Integer pontos) {
        jogador.put(nome, jogador.getOrDefault(nome, 0) + pontos);
    }

    public void listar() {
        for (Map.Entry<String, Integer> entry : jogador.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
