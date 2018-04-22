package singleton;

public class ContadorSingleton {

    private static ContadorSingleton INSTANCIA;

    private Integer valor;

    private ContadorSingleton() {
        this.valor = 0;
    }

    public static ContadorSingleton getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new ContadorSingleton();
        }
        return INSTANCIA;
    }

    public void contar() {
        valor ++;
    }

    public Integer getValorAtual() {
        return valor;
    }
}
