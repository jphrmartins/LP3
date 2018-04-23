package strategy.afterpattern.impostos;

import strategy.afterpattern.Imposto;

public class FGTS implements Imposto {
    @Override
    public String getName() {
        return "FGTS";
    }

    @Override
    public double calcular(double valor) {
        return valor * 0.2;
    }
}
