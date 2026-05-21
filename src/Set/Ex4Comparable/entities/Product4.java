package Set.Ex4Comparable.entities;

import java.util.Objects;

public class Product4 implements Comparable<Product4> {

    private String name;
    private Double price;

    public Product4(String name, Double price) {
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
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product4 product4 = (Product4) o;
        return Objects.equals(name, product4.name) && Objects.equals(price, product4.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product4{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product4 other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
