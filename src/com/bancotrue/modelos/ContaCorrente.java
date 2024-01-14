package com.bancotrue.modelos;

import com.bancotrue.entities.Conta;
import com.bancotrue.exceptionsUnchecked.SacaException;

public class ContaCorrente extends Conta {
    public ContaCorrente(Long id, String nome, double saldo, double imposto) {
        super(id, nome, saldo, imposto);
    }

    @Override
    public boolean depositar(double saldo) {
        System.out.printf("Valor creditado na sua conta Corrente de %.2f\n", this.getSaldo());
        customHora();
        return super.depositar(saldo);
    }

    @Override
    public void sacar(double saldo) throws SacaException {
        System.out.printf("Saque efetuado %s!", this.getNome());
        customHora();
        super.sacar(saldo);
    }

    @Override
    public void tranferir(double saldo, Conta conta) throws SacaException {
        super.tranferir(saldo-this.getImposto(), conta);
    }
}
