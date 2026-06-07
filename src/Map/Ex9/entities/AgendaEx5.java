package Map.Ex9.entities;

import java.util.HashMap;
import java.util.Map;

public class AgendaEx5 {
    private Map<String, String> agenda = new HashMap<>();

    public void adicionar(String nome, String telefone) {
        if (!agenda.containsKey(nome)) {
            agenda.put(nome, telefone);
        }
        else {
            System.out.println("Contato ja Cadastrado.");
        }
    }

    public String buscarTelefone(String nome) {
        if (!agenda.containsKey(nome)) {
            return agenda.get(nome);
        }
        else {
            return "Contato não encontrado.";
        }
    }

    public void remover(String nome) {
        agenda.remove(nome);
    }

    public void listar() {
        for (Map.Entry<String, String> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
