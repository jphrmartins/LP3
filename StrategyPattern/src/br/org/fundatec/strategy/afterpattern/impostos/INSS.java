package br.org.fundatec.strategy.afterpattern.impostos;

import br.org.fundatec.strategy.afterpattern.Imposto;

public class INSS implements Imposto {
    @Override
    public String getName() {
        return "INSS";
    }

    @Override
    public double calcular(double valor) {
        return valor * 1.2;
    }
}
