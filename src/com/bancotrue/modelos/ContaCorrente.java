package com.bancotrue.modelos;

import com.bancotrue.entities.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Long id, String nome, double saldo, double imposto) {
        super(id, nome, saldo, imposto);
    }

}
