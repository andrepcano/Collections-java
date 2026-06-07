package Map.Ex9.entities;

import java.util.HashMap;
import java.util.Map;

public class UsuarioEx6 {
    private Map<String, String> cadastro = new HashMap<>();


    public void cadastrar(String nome, String senha) {
        if (!cadastro.containsKey(nome)) {
            cadastro.put(nome, senha);
        }
        else {
            System.out.println("Ja existe um cadastro com esse nome.");
        }
    }

    public String autenticar(String nome, String senha) {
        if (!cadastro.containsKey(nome)) {
            return "Usuario incorreta!";
        }
        if (cadastro.get(nome).equals(senha)) {
            return "Login válido!";
        }
        else {
            return "Senha incorreta.";
        }
    }
}
