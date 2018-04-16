package br.org.fundatec.strategy.afterpattern;

public interface Imposto {
    String getName();
    double calcular(double valor);
}
