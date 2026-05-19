package Generics.Ex2.entities;

import Generics.Ex2.services.Bonificavel;

public class Developer extends Employee implements Bonificavel {
    private String language;

    public Developer(String name, Double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                ", Salary: " + getSalary() +
                ", Language: " + getLanguage();
    }

    @Override
    public double calcularBonus() {
        return getSalary() * 0.10;
    }



}
