package br.org.fundatec.strategy.afterpattern.impostos;

import br.org.fundatec.strategy.afterpattern.Imposto;

public class IPTU implements Imposto{
    @Override
    public String getName() {
        return "IPTU";
    }

    @Override
    public double calcular(double valor) {
        return valor * 0.5;
    }
}
