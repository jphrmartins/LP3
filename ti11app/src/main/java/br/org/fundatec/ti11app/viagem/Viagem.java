package br.org.fundatec.ti11app.viagem;

import java.time.LocalDate;
import java.util.Objects;

import br.org.fundatec.ti11app.passageiro.Passageiro;

public class Viagem {

	private Passageiro passageiro;
	private double kmRodado;
	private int quantidadeMinutos;
	private LocalDate dataViagem;

	public Viagem(Passageiro passageiro, double kmRodado, int quantidadeMinutos, LocalDate dataViagem) {
		this.passageiro = passageiro;
		this.kmRodado = kmRodado;
		this.quantidadeMinutos = quantidadeMinutos;
		this.dataViagem = dataViagem;
	}

	public LocalDate getDataViagem() {
		return dataViagem;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public double getKmRodado() {
		return kmRodado;
	}

	public int getQuantidadeMinutos() {
		return quantidadeMinutos;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Viagem that = (Viagem) o;
		return Double.compare(that.kmRodado, kmRodado) == 0 &&
				quantidadeMinutos == that.quantidadeMinutos &&
				Objects.equals(passageiro, that.passageiro) &&
				Objects.equals(dataViagem, that.dataViagem);
	}

	@Override
	public int hashCode() {
		return Objects.hash(passageiro, kmRodado, quantidadeMinutos, dataViagem);
	}
}
