package Generics.Ex2.entities;

import Generics.Ex2.services.Bonificavel;

public class Manager extends Employee implements Bonificavel {
    private String sector;


    public Manager(String name, Double salary, String sector) {
        super(name, salary);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public double calcularBonus() {
        return getSalary() * 0.20;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                ", Salary: " + getSalary() +
                ", Sector: " + getSector();
    }

}
