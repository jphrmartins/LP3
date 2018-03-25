package br.org.fundatec.ti11app.viagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ViagemDaoNaMemoria implements ViagemDao {

	private List<Viagem> viagens;

	public ViagemDaoNaMemoria() {
		this.viagens = new ArrayList<>();
	}

	@Override
	public Optional<Viagem> pegaViagemPeloNomePassageiro(String nome) {
		return viagens.stream()
				.filter(viagem -> viagem.getPassageiro().getNome().equals(nome))
				.findFirst();
	}

	@Override
	public void adiciona(Viagem viagem) {
		this.viagens.add(viagem);
	}

}
