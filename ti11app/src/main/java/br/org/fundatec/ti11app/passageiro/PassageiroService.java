package br.org.fundatec.ti11app.passageiro;

import java.util.Optional;

import br.org.fundatec.ti11app.calculadora.CalculadoraValores;
import br.org.fundatec.ti11app.viagem.Viagem;

public class PassageiroService {

	private PassageiroDao passageiroDao;
	private CalculadoraValores calculadoraValores;
	
	public PassageiroService(PassageiroDao passageiroDao, CalculadoraValores calculadoraValores) {
		this.passageiroDao = passageiroDao;
		this.calculadoraValores = calculadoraValores;
	}
	
	public Passageiro buscarPassageiroPeloNome(String nome) {
		return passageiroDao.buscarPorNome(nome).get();
	}
	
	public double calcularValorDevidoPeloPassageiro(Viagem viagem) {
		return calculadoraValores.calcularValorDevidoPassageiro(viagem);
	}
	
	public void adicionar(Passageiro passageiro) {
		if(passageiroDao.buscarPorNome(passageiro.getNome()).isPresent()) {
			System.out.println("O Passageiro " + passageiro.getNome() + " Já existe");
			return;
		}
		this.passageiroDao.adicionar(passageiro);
	}
	
	
}
