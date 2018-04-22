package abstractfactory;

public abstract class ConstrutorEscola {

    public static ConstrutorEscola instanciar(int tipo) {
        if (tipo == Escola.ENSINO_PRIMARIO)
            return new ConstrutorEscolaEnsinoPrimario();
        return new ConstrutorEscolaEnsinoMedio();
    }

    abstract Escola construir();
}
