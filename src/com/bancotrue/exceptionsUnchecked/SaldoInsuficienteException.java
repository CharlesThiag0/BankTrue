package com.bancotrue.exceptionsUnchecked;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException (String mensagem) {
        super(mensagem);
    }
}
