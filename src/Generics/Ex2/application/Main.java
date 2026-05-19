package Generics.Ex2.application;

import Generics.Ex2.entities.Developer;
import Generics.Ex2.entities.Employee;
import Generics.Ex2.entities.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static Generics.Ex2.services.MaxService.imprimirLista;
import static Generics.Ex2.services.MaxService.max;

public class Main {
    static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        Locale.setDefault(Locale.ENGLISH);

        list.add(new Developer("André", 45800.00, "Java"));
        list.add(new Developer("Yan", 15800.00, "C#"));

        list.add(new Manager("Caio", 70000.00, "PO"));
        list.add(new Manager("Melissa Macedo", 100000.00, "CEO"));


        System.out.println("The highest salary: ");
        System.out.println(max(list));

       imprimirLista(list);

    }
}
