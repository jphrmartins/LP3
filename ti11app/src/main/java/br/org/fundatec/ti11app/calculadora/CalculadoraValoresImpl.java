package br.org.fundatec.ti11app.calculadora;

import java.time.LocalDate;

import br.org.fundatec.ti11app.motorista.Motorista;
import br.org.fundatec.ti11app.viagem.Viagem;

public class CalculadoraValoresImpl implements CalculadoraValores {

	@Override
	public Double calcularValorMotorista(Motorista motorista,
			LocalDate dataViagemInicio, LocalDate dataViagemFim) {
		double valorCorrida = 0;

		for (Viagem Viagem : motorista.getViagens()) {
			//System.out.println(Viagem.getNome() + " " + ((Viagem.getQuantidadeMinutos() * 0.50) + (Viagem.getKmRodado() * 0.20)));
			if (Viagem.getDataViagem().compareTo(dataViagemInicio) >= 0
					&& Viagem.getDataViagem().compareTo(dataViagemFim) <= 0) {
				valorCorrida += (Viagem.getQuantidadeMinutos() * 0.50) + (Viagem.getKmRodado() * 0.20);
			}
		}
		return valorCorrida;
	}

	@Override
	public Double calcularValorDevidoPassageiro(Viagem Viagem) {
		double resultado = (Viagem.getQuantidadeMinutos() * 0.50) + (Viagem.getKmRodado() * 0.20);
		return resultado + (resultado * 0.15);
	}
	
	
}
