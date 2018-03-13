package br.fundatec.lp3.AppTest;

import java.util.ArrayList;
import java.util.List;

import br.fundatec.lp3.calculaCorrida.CalculaCorrida;
import br.fundatec.lp3.motorista.Motorista;
import br.fundatec.lp3.passageiro.Passageiro;

public class Aplication {
	public static void main(String[] args) {
		
		Passageiro maria = new Passageiro("Maria", 12.0, 5);
		Passageiro nathalia = new Passageiro("Nathalia", 50.0, 30);
		Passageiro raizen = new Passageiro("Raizen", 20.0, 13);
		Passageiro ilidan = new Passageiro("Ilidan", 70, 60);
		
		
		
		List<Passageiro> listaDePassageiro  = new ArrayList<>();
		listaDePassageiro.add(maria);
		listaDePassageiro.add(nathalia);
		listaDePassageiro.add(raizen);
		listaDePassageiro.add(ilidan);
		
		Motorista motorista = new Motorista("João", listaDePassageiro);
		
		CalculaCorrida calc = new CalculaCorrida();
		double valorFinal = calc.calcula(motorista);
		
		System.out.println("O motorista deve receber " + valorFinal + " Reais.");
	}
}
