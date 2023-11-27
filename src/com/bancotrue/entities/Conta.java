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

    public boolean depositar (double saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
            return true;
        } else {
            System.out.println("Valor não aceito");
            return false;
        }
    }

    public boolean sacar (double saldo) {
        if (saldo > 0) {
            this.saldo -= saldo;
            return true;
        }
        return false;
    }

    public void tranferir (double saldo, Conta conta) {
        sacar(saldo);
        conta.depositar(saldo);
    }

}
