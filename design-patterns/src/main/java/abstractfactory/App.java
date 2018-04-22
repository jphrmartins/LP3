package abstractfactory;

public class App {
    public static void main(String[] args) {
        Escola jardim = ConstrutorEscola.instanciar(Escola.ENSINO_PRIMARIO)
                .construir();
        System.out.println(jardim);

        Escola medio = ConstrutorEscola.instanciar(Escola.ENSINO_MEDIO)
                .construir();
        System.out.println(medio);
    }
}
