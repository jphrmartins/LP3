package abstractfactory;

import java.util.List;

public class EscolaEnsinoPrimario extends Escola {
    public EscolaEnsinoPrimario(List<Sala> salas, Biblioteca biblioteca) {
        super(salas, biblioteca);
    }

    @Override
    public String toString() {
        return "EscolaEnsinoPrimario";
    }
}
