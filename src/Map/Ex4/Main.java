package Map.Ex4;

import Map.Ex4.entities.Contatos;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {

        Contatos ctt = new Contatos();

        ctt.adicionarContato("André", "11976336418");
        ctt.adicionarContato("Nilza", "11994508321");
        ctt.adicionarContato("Renato", "11976336418");

        System.out.println("Telefone do André: ");
        System.out.println(ctt.BuscarTelefone("André"));

        System.out.println("\nContatos:");
        ctt.listarTodosContatos();

        ctt.removerContato("Renato");
        System.out.println("\nApós remover Renato: ");
        ctt.listarTodosContatos();


    }
}
