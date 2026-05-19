package Generics.Ex1.entities;

import Generics.Ex1.services.Tributavel;

public class Smartphone extends Product implements Tributavel {
    private Integer cameraMP;


    public Smartphone(String name, Double price, Integer cameraMP) {
        super(name, price);
        this.cameraMP = cameraMP;
    }

    public Integer getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(Integer cameraMP) {
        this.cameraMP = cameraMP;
    }

    @Override
    public double calcularImposto() {
        return getPrice() * 0.15;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Camera: "
                + cameraMP + "MP";
    }
}
