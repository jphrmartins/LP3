package strategy.afterpattern;

import strategy.afterpattern.impostos.IPTU;

public class AppAfertPattern {
    public static void main(String[] args) {
        CalculadoraImpostoAfterPattern calculadoraImposto = new CalculadoraImpostoAfterPattern();

        double imposto = calculadoraImposto.verificaValorImposto(300, new IPTU());

        System.out.println("Imposto -> R$" + imposto);
    }

}
