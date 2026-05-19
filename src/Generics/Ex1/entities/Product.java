package Generics.Ex1.entities;

import Generics.Ex1.services.Tributavel;

import java.util.List;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());

    }

    @Override
    public String toString() {
        return "Name: "
                + name
                + ", Price: "
                + price;
    }

    public static void imprimirLista(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
