package br.org.fundatec.ti11app.calculadora;

import java.time.LocalDate;

import br.org.fundatec.ti11app.motorista.Motorista;
import br.org.fundatec.ti11app.viagem.Viagem;

public interface CalculadoraValores {
    Double calcularValorMotorista(Motorista motorista, LocalDate dataInicio, LocalDate dataFim);
    Double calcularValorDevidoPassageiro(Viagem viagem);
}
