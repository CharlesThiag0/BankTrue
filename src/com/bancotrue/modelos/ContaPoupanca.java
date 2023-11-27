package com.bancotrue.modelos;

import com.bancotrue.entities.Conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

    public ContaPoupanca(Long id, String nome, double saldo, double imposto) {
        super(id, nome, saldo, imposto);
    }

    @Override
    public boolean sacar(double saldo) {
        if (getSaldo() >= saldo+getImposto()) {
            System.out.println("Aprovado seu saque!");
            return super.sacar(saldo+getImposto());
        }
        System.out.println("Negado seu saque!");
        return  false;
    }

    @Override
    public boolean depositar(double saldo) {
        System.out.printf("Valor retido de %.2f\n", this.getImposto());
        return super.depositar(saldo - getImposto());
    }

    @Override
    public void tranferir(double saldo, Conta conta) {
        super.tranferir(saldo, conta);
    }

    @Override
    public int compareTo(ContaPoupanca contaPoupanca) {
        return this.getNome().compareTo(contaPoupanca.getNome()) ;
    }
}
