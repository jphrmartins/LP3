package singleton;

public class Contador {

    private Integer valor;

    public Contador() {
        this.valor = 0;
    }

    public void contar() {
        valor ++;
    }

    public Integer getValorAtual() {
        return valor;
    }

}
