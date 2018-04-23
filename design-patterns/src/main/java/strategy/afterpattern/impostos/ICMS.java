package strategy.afterpattern.impostos;

import strategy.afterpattern.Imposto;

public class ICMS implements Imposto {
    @Override
    public String getName() {
        return "ICMS";
    }

    @Override
    public double calcular(double valor) {
        return valor * 0.7;
    }
}
