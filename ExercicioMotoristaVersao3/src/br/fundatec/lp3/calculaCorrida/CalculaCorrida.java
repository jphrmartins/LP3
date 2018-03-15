package br.fundatec.lp3.calculaCorrida;

import br.fundatec.lp3.motorista.Motorista;
import br.fundatec.lp3.passageiro.Passageiro;

public class CalculaCorrida {

	public Double calculaViagem(Motorista motorista, String dataViagemInicio, String dataViagemFim) {
		double valorCorrida = 0;

		for (Passageiro passageiro : motorista.getListaDePassageiro()) {
			//System.out.println(passageiro.getNome() + " " + ((passageiro.getQuantidadeMinutos() * 0.50) + (passageiro.getKmRodado() * 0.20)));
			if (passageiro.getDataViagem().compareTo(dataViagemInicio) > 0
					&& passageiro.getDataViagem().compareTo(dataViagemFim) < 0) {
				valorCorrida += (passageiro.getQuantidadeMinutos() * 0.50) + (passageiro.getKmRodado() * 0.20);
			}
		}
		return valorCorrida;
	}
	
	public double calculaValorDevidoPeloPassageiro(Passageiro passageiro) {
		double resultado = (passageiro.getQuantidadeMinutos() * 0.50) + (passageiro.getKmRodado() * 0.20);
		return resultado = (resultado * 0.15);
	}
	
	
}
