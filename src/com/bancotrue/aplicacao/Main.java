package com.bancotrue.aplicacao;

import com.bancotrue.entities.Conta;
import com.bancotrue.modelos.ContaCorrente;
import com.bancotrue.modelos.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca poupanca0 = new ContaPoupanca(121212L, "Thiago", 2000.0, 5.00);
        ContaPoupanca poupanca1 = new ContaPoupanca(131313L, "Charles", 200.0, 5.00);
        ContaPoupanca poupanca2 = new ContaPoupanca(141414L, "Santos", 20.0, 5.00);

        ArrayList<ContaPoupanca> listaPoupanca = new ArrayList<>();
        listaPoupanca.add(poupanca0);
        listaPoupanca.add(poupanca1);
        listaPoupanca.add(poupanca2);
        System.out.println("Sem organização");
        listaPoupanca.forEach(x -> System.out.println(x.getNome()));

        //organizar lista por ordem alfabetica
        Collections.sort(listaPoupanca);
        System.out.println("Com organização");
        listaPoupanca.forEach(x -> System.out.println(x.getNome()));

        ContaCorrente corrente0 = new ContaCorrente(2323L, "chakes", 1000.0, 10.0);
        ContaCorrente corrente1 = new ContaCorrente(3434L, "chaves", 10.0, 10.0);
        ContaCorrente corrente2 = new ContaCorrente(1212L, "chavier", 1.0, 10.0);

        ArrayList<ContaCorrente> listaCorrente = new ArrayList<>();

        listaCorrente.add(corrente0);
        listaCorrente.add(corrente1);
        listaCorrente.add(corrente2);

        //ogarnizar lista por ordem pelo id
        System.out.println("Sem organização");
        listaCorrente.forEach(x -> System.out.println(x.getNome()));

        System.out.println("Com organização");
        listaCorrente.sort(Comparator.comparing(Conta::getId));
        listaCorrente.forEach(x -> System.out.println(x.getNome()));

    }
}