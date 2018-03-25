package br.org.fundatec.ti11app.motorista;

import java.time.LocalDate;
import java.util.Optional;

import br.org.fundatec.ti11app.calculadora.CalculadoraValores;

public class MotoristaService {

	private MotoristaDao motoristaDao;
	private CalculadoraValores calculadoraValores;

	public MotoristaService(MotoristaDao motoristaDao, CalculadoraValores calculadoraValores) {
		this.motoristaDao = motoristaDao;
		this.calculadoraValores = calculadoraValores;
	}

	public Motorista buscarMotoristaPorNome(String nome) {
		return motoristaDao.buscarPorNome(nome).get();
	}

	public double calcularValorAReceber(String nome, LocalDate inicio, LocalDate fim) {
		return motoristaDao.buscarPorNome(nome)
				.map(motorista -> calculadoraValores.calcularValorMotorista(motorista, inicio, fim)).orElse(0.0);
	}

	public void adicionar(Motorista motorista) {
		if (motoristaDao.buscarPorNome(motorista.getNome()).isPresent()) {
			System.out.println("nome " + motorista.getNome() + " já existe!");
			return;
		}
		motoristaDao.adicionar(motorista);
	}
}
