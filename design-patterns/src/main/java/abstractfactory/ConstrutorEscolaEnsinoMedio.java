package abstractfactory;

import java.util.Arrays;

public class ConstrutorEscolaEnsinoMedio extends ConstrutorEscola {
    @Override
    public Escola construir() {
        return new EscolaEnsinoMedio(Arrays.asList(new Sala()), new Biblioteca());
    }
}
