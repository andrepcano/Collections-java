package Generics.ExExemplo.application;

import Generics.ExExemplo.entities.Product;
import Generics.ExExemplo.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    static void main() {

        List<Product> list = new ArrayList<>();
        //List<?> (TIPO CORINGA) Lista de qualquer tipo (MAS NAO DA PARA ADICIONAR ELEMENTOS NELA)
        Locale.setDefault(Locale.ENGLISH);

        //Computer,890.50
        //Iphone X,910.00
        //Tablet,550.00
        String path = "C:\\Windows\\Temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.print("Most expensive : ");
            System.out.println(x);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
