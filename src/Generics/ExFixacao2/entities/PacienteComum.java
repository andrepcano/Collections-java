package Generics.ExFixacao2.entities;

import Generics.ExFixacao2.services.Identificavel;

public class PacienteComum implements Identificavel {
    private String name;
    private String cpf;
    private String queixa;

    public PacienteComum(String name, String cpf, String queixa) {
        this.name = name;
        this.cpf = cpf;
        this.queixa = queixa;
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

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    @Override
    public String getId() {
        return cpf;
    }

    @Override
    public String getDescricao() {
        return name + " - Queixa: " + queixa;
    }

}
