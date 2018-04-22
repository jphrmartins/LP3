package br.org.fundatec.strategy.beforepattern;

public class App {

	public static void main(String[] args) {
		double valor = 300;

		CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

		double result = calculadoraImposto.calcular(valor, ImpostoType.IPTU);

        System.out.println("Valor devido: " + result);
	}

}
