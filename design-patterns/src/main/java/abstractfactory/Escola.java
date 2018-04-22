package abstractfactory;

import java.util.List;

public abstract class Escola {

    public static final int ENSINO_PRIMARIO = 1;
    public static final int ENSINO_MEDIO = 2;

    private List<Sala> salas;
    private Biblioteca biblioteca;

    public Escola(List<Sala> salas, Biblioteca biblioteca) {
        this.salas = salas;
        this.biblioteca = biblioteca;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
}
