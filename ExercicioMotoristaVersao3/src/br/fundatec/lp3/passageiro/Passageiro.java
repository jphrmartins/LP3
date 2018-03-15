package br.fundatec.lp3.passageiro;

public class Passageiro {

	private String nome;
	private double kmRodado;
	private int quantidadeMinutos;
	private String dataViagem;

	public Passageiro(String nome, double kmRodado, int quantidadeMinutos, String dataViagem) {
		super();
		this.nome = nome;
		this.kmRodado = kmRodado;
		this.quantidadeMinutos = quantidadeMinutos;
		this.dataViagem = dataViagem;
	}

	public String getDataViagem() {
		return dataViagem;
	}

	public void setDataViagem(String dataViagem) {
		this.dataViagem = dataViagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getKmRodado() {
		return kmRodado;
	}

	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}

	public int getQuantidadeMinutos() {
		return quantidadeMinutos;
	}

	public void setQuantidadeMinutos(int quantidadeMinutos) {
		this.quantidadeMinutos = quantidadeMinutos;
	}
}
