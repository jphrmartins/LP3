package br.org.fundatec.ti11app.passageiro;

public class Passageiro {
	private String nome;

	public Passageiro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Passaeiro{nome:" + nome + "}";
	}
}
