package com.bancotrue.modelos;

import com.bancotrue.entities.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Long id, String nome, double saldo, double imposto) {
        super(id, nome, saldo, imposto);
    }

    @Override
    public boolean depositar(double saldo) {
        System.out.printf("Valor creditado na sua conta Corrente de %.2f\n", this.getSaldo());
        return super.depositar(saldo);
    }

    @Override
    public boolean sacar(double saldo) {
        System.out.printf("Saque efetuado %s!", this.getNome());
        return super.sacar(saldo);
    }

    @Override
    public void tranferir(double saldo, Conta conta) {
        super.tranferir(saldo-this.getImposto(), conta);
    }
}
