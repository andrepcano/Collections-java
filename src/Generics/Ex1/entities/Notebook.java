package Generics.Ex1.entities;

import Generics.Ex1.services.Tributavel;

public class Notebook extends Product implements Tributavel {
    private Integer memoriaRam;


    public Notebook(String name, Double price, Integer memoriaRam) {
        super(name, price);
        this.memoriaRam = memoriaRam;
    }

    public Integer getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(Integer memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    @Override
    public double calcularImposto() {
        return getPrice() * 0.10;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", RAM: "
                + memoriaRam + "GB";
    }
}
