package br.fundatec.lp3.motorista;

import java.util.List;

import br.fundatec.lp3.passageiro.Passageiro;

public class Motorista {
	private String nome;
	private List<Passageiro> listaDePassageiro;
	
	public Motorista(String nome, List<Passageiro> listaDePassageiro) {
		super();
		this.nome = nome;
		this.listaDePassageiro = listaDePassageiro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Passageiro> getListaDePassageiro() {
		return listaDePassageiro;
	}
	public void setListaDePassageiro(List<Passageiro> listaDePassageiro) {
		this.listaDePassageiro = listaDePassageiro;
	}
}
