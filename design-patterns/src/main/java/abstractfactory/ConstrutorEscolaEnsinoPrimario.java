package abstractfactory;

import java.util.Arrays;

public class ConstrutorEscolaEnsinoPrimario extends ConstrutorEscola {
    @Override
    public Escola construir() {
        return new EscolaEnsinoPrimario(Arrays.asList(new Sala()), null);
    }
}
