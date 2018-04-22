package abstractfactory;

import java.util.List;

public class EscolaEnsinoMedio extends Escola {

    public EscolaEnsinoMedio(List<Sala> salas, Biblioteca biblioteca) {
        super(salas, biblioteca);
    }

    @Override
    public String toString() {
        return "EscolaEnsinoMedio";
    }
}
