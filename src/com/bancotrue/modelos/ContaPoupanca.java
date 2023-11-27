package com.bancotrue.modelos;

import com.bancotrue.entities.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Long id, String nome, double saldo, double imposto) {
        super(id, nome, saldo, imposto);
    }

}
