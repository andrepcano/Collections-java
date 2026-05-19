package Generics.Ex1.application;

import Generics.Ex1.entities.Notebook;
import Generics.Ex1.entities.Product;
import Generics.Ex1.entities.Smartphone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Generics.Ex1.entities.Product.imprimirLista;
import static Generics.Ex1.services.CalcService.max;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        list.add(new Notebook("Dell", 5500.00, 16));
        list.add(new Notebook("MacBook", 7500.00, 16));
        list.add(new Smartphone("Iphone", 9000.00, 80));
        list.add(new Smartphone("Motorola", 2000.00, 40));

        Product maior = max(list);

        System.out.print("Produto mais caro: ");
        System.out.println(maior);

        imprimirLista(list);
    }
}
