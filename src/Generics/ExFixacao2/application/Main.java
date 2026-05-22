package Generics.ExFixacao2.application;

import Generics.ExFixacao2.entities.Fila;
import Generics.ExFixacao2.entities.PacienteComum;
import Generics.ExFixacao2.entities.PacienteUrgente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Fila<PacienteComum> pacienteComums = new Fila<>();
        Fila<PacienteUrgente> pacienteUrgentes = new Fila<>();

        PacienteComum pc1 = new PacienteComum("Maria", "67598720932", "Dor de barriga");
        PacienteComum pc2 = new PacienteComum("Bruno", "23354322342", "Dor de Cabeça");
        PacienteComum pc3 = new PacienteComum("Theo", "54322321733", "Mal estar");


        PacienteUrgente pu1 = new PacienteUrgente("Dennis", "37443267566", 2);
        PacienteUrgente pu2 = new PacienteUrgente("Valdemar", "54351323132", 3);
        PacienteUrgente pu3 = new PacienteUrgente("Marciele", "36278356268", 1);



        System.out.println("=== Fila Comum ===");

        pacienteComums.entrar(pc1);
        System.out.println("Entrou na fila: " + pc1.getDescricao());

        pacienteComums.entrar(pc2);
        System.out.println("Entrou na fila: " + pc2.getDescricao());

        pacienteComums.entrar(pc3);
        System.out.println("Entrou na fila: " + pc3.getDescricao());

        System.out.println("\nChamando: " + pacienteComums.chamarProximo().getDescricao());
        System.out.println("Chamando: " + pacienteComums.chamarProximo().getDescricao());
        System.out.println("Próximo da fila: " + pacienteComums.espiarProximo().getDescricao());

        System.out.println("\nCPF 54322321733 ainda na fila? " + pacienteComums.contemId("54322321733"));

        System.out.println("=== Fila Urguente ===");

        pacienteUrgentes.entrar(pu1);
        System.out.println("\nChamando: " + pacienteUrgentes.chamarProximo().getDescricao());
        pacienteUrgentes.entrar(pu2);
        System.out.println("Chamando: " + pacienteUrgentes.chamarProximo().getDescricao());
        pacienteUrgentes.entrar(pu3);
        System.out.println("Chamando: " + pacienteUrgentes.chamarProximo().getDescricao());

        sc.close();
    }
}
