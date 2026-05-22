package Generics.ExFixacao2.entities;

import Generics.ExFixacao2.services.Identificavel;

public class PacienteUrgente implements Identificavel {
    private String name;
    private String cpf;
    private Integer nivelRisco;

    public PacienteUrgente(String name, String cpf, Integer nivelRisco) {
        this.name = name;
        this.cpf = cpf;
        this.nivelRisco = nivelRisco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(Integer nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    @Override
    public String getId() {
        return cpf;
    }

    @Override
    public String getDescricao() {
        return name + " - Nivel de Risco: " + nivelRisco;
    }
}
