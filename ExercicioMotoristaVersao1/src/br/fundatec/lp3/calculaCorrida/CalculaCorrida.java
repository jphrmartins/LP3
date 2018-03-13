package br.fundatec.lp3.calculaCorrida;

import java.util.List;

import br.fundatec.lp3.motorista.Motorista;
import br.fundatec.lp3.passageiro.Passageiro;

public class CalculaCorrida {

	private Passageiro passageiro;
	private double valorCorrida = 0;

	public Double calcula(Motorista motorista) {
		List<Passageiro> listaPassageiros = motorista.getListaDePassageiro();
		
		for (Passageiro passageiro : listaPassageiros) {
			valorCorrida = (passageiro.getQuantidadeMinutos() * 0.50) + (passageiro.getKmRodado() * 0.20);
		}
		return valorCorrida;
	}
}
