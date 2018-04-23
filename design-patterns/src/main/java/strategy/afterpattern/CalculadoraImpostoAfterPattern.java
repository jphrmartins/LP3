package strategy.afterpattern;

public class CalculadoraImpostoAfterPattern {
    public double verificaValorImposto(double valor, Imposto imposto) {
        double result = imposto.calcular(valor);
        System.out.println("imposto = [" + imposto.getName() + "]");
        return result;
    }
}
