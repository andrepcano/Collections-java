package Map.Ex9.entities;

import java.util.HashMap;
import java.util.Map;

public class CadastroEx4 {
    private Map<String, Boolean> alunos = new HashMap<>();

    public void adicionar(String nome) {
        if (!alunos.containsKey(nome)) {
            alunos.put(nome, true);
        } else {
            System.out.println("Aluno ja cadastrado!");
        }
    }

    public void listar() {
        for (String nome : alunos.keySet()) {
            System.out.println(nome);
        }
    }
}
