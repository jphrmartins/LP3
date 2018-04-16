package br.org.fundatec.strategy.beforepattern;

public class CalculadoraImposto {

    public double calcular(double valor, ImpostoType imposto) {
        if (ImpostoType.FGTS.equals(imposto)) {
            System.out.println("imposto = [ " + imposto.name() + " ]");
            return valor * 0.2;
        } else if (ImpostoType.ICMS.equals(imposto)) {
            System.out.println("imposto = [ " + imposto.name() + " ]");
            return valor * 0.7;
        } else if (ImpostoType.INSS.equals(imposto)) {
            System.out.println("imposto = [ " + imposto.name() + " ]");
            return valor * 1.2;
        } else {
            System.out.println("imposto = [ " + imposto.name() + " ]");
            return valor * 0.5;
        }
    }
}
