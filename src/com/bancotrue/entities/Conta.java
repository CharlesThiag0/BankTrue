package com.bancotrue.entities;

import com.bancotrue.exceptionsUnchecked.SacaException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    public void sacar (double saldo) throws SacaException {
        if (this.saldo < saldo) {
           throw new SacaException(String.format
                   ("Saldo: %.2f, Valor: %.2f", this.saldo, saldo));
        }

        this.saldo -= saldo;
    }

    public void tranferir (double saldo, Conta conta) throws SacaException {
        sacar(saldo);
        conta.depositar(saldo);
    }

    public void customHora (){
        System.out.printf("Horario da operação: %s\n", LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
    }

}
