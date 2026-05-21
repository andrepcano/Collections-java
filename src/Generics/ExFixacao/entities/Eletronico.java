package Generics.ExFixacao.entities;

import Generics.ExFixacao.services.Precificavel;

public class Eletronico implements Precificavel {
    private String nome;
    private String marca;
    private Double preco;

    public Eletronico() {
    }

    public Eletronico(String nome, String marca, Double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
