package Map.Ex9.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueEx9 {
    private Map<String, Integer> estoque = new HashMap<>();

    public void adicionar(String produto, int quantidade) {
        estoque.put(produto, estoque.getOrDefault(produto, 0) + quantidade);
    }

    public void venderProdutos(String produto, int quantidade) {
        if (!estoque.containsKey(produto)) {
            System.out.println("Produto não existe!");
        }

        int estoqueAtual = estoque.get(produto);
        if (estoqueAtual < 0) {
            System.out.println("Estoque Insuficiente!");
        }

        int estoqueNovo = estoqueAtual - quantidade;
        if (estoqueNovo == 0) {
            estoque.remove(produto);
        }
        else {
            estoque.put(produto, estoqueNovo);
        }
    }

    public void listar() {
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
