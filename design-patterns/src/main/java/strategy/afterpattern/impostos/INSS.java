package strategy.afterpattern.impostos;

import strategy.afterpattern.Imposto;

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
