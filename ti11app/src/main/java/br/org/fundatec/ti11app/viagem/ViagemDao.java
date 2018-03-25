package br.org.fundatec.ti11app.viagem;

import java.util.Optional;

public interface ViagemDao {
	Optional<Viagem> pegaViagemPeloNomePassageiro(String nome);
	void adiciona(Viagem viagem);
}
