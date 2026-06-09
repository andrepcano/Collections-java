package Map.Ex9.entities;

import java.util.HashMap;
import java.util.Map;

public class EstoqueEx15 {
    private Map<String, Integer> estoque = new HashMap<>();

    public String maiorEstoque(Map<String, Integer> produtos) {
        int maior = 0;
        String maiorQuantidade = "";
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            if (entry.getValue() > maior) {
                maior = entry.getValue();
                maiorQuantidade = entry.getKey();
            }
        }
        return "Produto com maior estoque: " + maiorQuantidade + " estoque: " + maior;
    }
}
