package com.bancotrue.aplicacao;

import com.bancotrue.exceptionsUnchecked.SacaException;
import com.bancotrue.modelos.ContaPoupanca;

public class MainTesteExceptions {
    public static void main(String[] args) {
        ContaPoupanca teste1 = new ContaPoupanca(1224L, "Charles", 20.0, 0.01);

        try {
            teste1.sacar(100.0); // usar try catch na classe que quer usar os metudos
        } catch (SacaException e) {

            System.out.printf("Exception: %s\n", e.getMessage());
        }

        System.out.println(teste1.getId());


    }
}
