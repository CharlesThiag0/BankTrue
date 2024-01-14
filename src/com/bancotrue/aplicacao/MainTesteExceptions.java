package com.bancotrue.aplicacao;

import com.bancotrue.modelos.ContaPoupanca;

public class MainTesteExceptions {
    public static void main(String[] args) {
        ContaPoupanca teste1 = new ContaPoupanca(1224L, "Charles", 200.0, 0.01);
        teste1.sacar(1000.0);


    }
}
