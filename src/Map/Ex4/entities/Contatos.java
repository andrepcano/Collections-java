package Map.Ex4.entities;

import java.util.HashMap;
import java.util.Map;

public class Contatos {

    private Map<String, String> contatos = new HashMap<>();

    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    public String BuscarTelefone(String nome) {
        return contatos.get(nome);
    }

    public void removerContato(String nome) {
        contatos.remove(nome);
    }

    public void listarTodosContatos() {
        for(Map.Entry<String, String> entry : contatos.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
