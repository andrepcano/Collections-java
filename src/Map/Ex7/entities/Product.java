package Map.Ex7.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;

public class Product {
    private Map<String, Integer> produtos = new HashMap<>();

    public void adicionar(String produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public void venderProdutos(String produto,  int quantidade) {
        if (!produtos.containsKey(produto)) {
            System.out.println("Produto nao existe!");
        }

        int estoqueAtual = produtos.get(produto);

        if (estoqueAtual < quantidade) {
            System.out.println("Estoque insuficiente!");
        }

        int estoqueNovo = estoqueAtual - quantidade;
        if (estoqueNovo == 0) {
            produtos.remove(produto);
        }
        else {
            produtos.put(produto, estoqueNovo);
        }
    }

    public void produtosAbaixo(int limite) {
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            if (entry.getValue() < limite) {
                System.out.println(
                        entry.getKey() + " -> "
                                + entry.getValue()
                );
            }
        }
    }

    public void listarTodos() {
        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
