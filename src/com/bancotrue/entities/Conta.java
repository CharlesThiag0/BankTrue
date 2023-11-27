package com.bancotrue.entities;

public class Conta {
        private Long id;
        private String nome;
        private double saldo;
        private double imposto;

    public Conta(Long id, String nome, double saldo, double imposto) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
        this.imposto = imposto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
