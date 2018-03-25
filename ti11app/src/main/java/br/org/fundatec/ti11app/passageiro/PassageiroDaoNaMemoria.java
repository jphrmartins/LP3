package br.org.fundatec.ti11app.passageiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PassageiroDaoNaMemoria implements PassageiroDao {

	private List<Passageiro> passageiros;
	
	
	public PassageiroDaoNaMemoria() {
		this.passageiros = new ArrayList<>();
	}

	@Override
	public Optional<Passageiro> buscarPorNome(String nome) {
		return passageiros.stream().filter(passageiro -> passageiro.getNome().equals(nome)).findFirst();
	}

	@Override
	public void adicionar(Passageiro passageiro) {
		this.passageiros.add(passageiro);
		System.out.println(passageiros);
	}

}
