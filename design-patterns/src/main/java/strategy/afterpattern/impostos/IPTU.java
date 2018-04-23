package strategy.afterpattern.impostos;

import strategy.afterpattern.Imposto;

public class IPTU implements Imposto {
	@Override
	public String getName() {
		return "IPTU";
	}

	@Override
	public double calcular(double valor) {
		return valor * 0.5;
	}
}
