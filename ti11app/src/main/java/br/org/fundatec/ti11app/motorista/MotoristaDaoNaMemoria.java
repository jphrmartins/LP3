package br.org.fundatec.ti11app.motorista;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MotoristaDaoNaMemoria implements MotoristaDao {

    private List<Motorista> motoristas;

    public MotoristaDaoNaMemoria() {
        motoristas = new ArrayList<>();
    }

    public Optional<Motorista> buscarPorNome(String nome) {
        return motoristas.stream()
                .filter(motorista -> motorista.getNome().equals(nome))
                .findFirst();
    }

    @Override
    public void adicionar(Motorista motorista) {
        motoristas.add(motorista);

        System.out.println(motoristas);
    }
}
