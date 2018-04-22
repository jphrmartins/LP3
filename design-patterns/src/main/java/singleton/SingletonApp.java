package singleton;

public class SingletonApp {
    public static void main(String[] args) {
        SingletonApp app = new SingletonApp();
        app.naoSingleton();
        app.singleton();
    }

    private void singleton() {
        System.out.println("SINGLETON [1]: " + ContadorSingleton.getInstancia()
                .getValorAtual()); // 0
        ContadorSingleton.getInstancia().contar();
        System.out.println("SINGLETON [2]: " + ContadorSingleton.getInstancia()
                .getValorAtual()); // 1
        contarSingleton();
    }

    private void contarSingleton() {
        ContadorSingleton contador = ContadorSingleton.getInstancia();
        System.out.println("SINGLETON [3]: " + contador.getValorAtual()); // 1
        contador.contar();
        ContadorSingleton contador2 = ContadorSingleton.getInstancia();
        System.out.println("SINGLETON [4]: " + contador2.getValorAtual()); // 2
    }

    private void naoSingleton() {
        Contador contador = new Contador();
        System.out.println("CONTADOR [1]: " + contador.getValorAtual());
        contador.contar();
        System.out.println("CONTADOR [2]: " + contador.getValorAtual());
        contar();
    }

    private void contar() {
        Contador contador = new Contador();
        System.out.println("CONTADOR [3]: " + contador.getValorAtual());
        contador.contar();
        System.out.println("CONTADOR [4]: " + contador.getValorAtual());
    }
}
