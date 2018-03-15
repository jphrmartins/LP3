package br.fundatec.lp3.AppTest;

import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp3.calculaCorrida.CalculaCorrida;
import br.fundatec.lp3.motorista.Motorista;
import br.fundatec.lp3.passageiro.Passageiro;

public class Application {
	public static void main(String[] args) {
		
		Passageiro maria = new Passageiro("Maria", 12.0, 5, "2018-02-15");
		Passageiro nathalia = new Passageiro("Nathalia", 50.0, 30, "2018-02-18");
		Passageiro raizen = new Passageiro("Raizen", 20.0, 13, "2018-03-10");
		Passageiro ilidan = new Passageiro("Ilidan", 70, 60, "2018-03-27");
		
		List<Passageiro> listaDePassageiro  = new ArrayList<>();
		listaDePassageiro.add(maria);
		listaDePassageiro.add(nathalia);
		listaDePassageiro.add(raizen);
		listaDePassageiro.add(ilidan);
		
		Motorista motorista = new Motorista("João", listaDePassageiro);
		
		CalculaCorrida calculaCorrida = new CalculaCorrida();
		double valorFinal = calculaCorrida.calculaViagem(motorista, "2018-02-01", "2018-03-30");
		
		System.out.println("O motorista deve receber " + valorFinal + " Reais.");
		//Para cada passageiro da coleção "ListaDePassageiro" faça o que está dentro das chaves do for.
		for (Passageiro passageiro : listaDePassageiro) {
			System.out.println("Valor devido pelo passageiro: " + passageiro.getNome() + " " + calculaCorrida.calculaValorDevidoPeloPassageiro(passageiro));
		}
		
	}
}
