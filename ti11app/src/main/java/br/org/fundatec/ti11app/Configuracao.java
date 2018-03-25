package br.org.fundatec.ti11app;

import br.org.fundatec.ti11app.calculadora.CalculadoraValoresImpl;
import br.org.fundatec.ti11app.motorista.MotoristaDaoNaMemoria;
import br.org.fundatec.ti11app.motorista.MotoristaService;
import br.org.fundatec.ti11app.passageiro.PassageiroDaoNaMemoria;
import br.org.fundatec.ti11app.passageiro.PassageiroService;
import br.org.fundatec.ti11app.viagem.ViagemDaoNaMemoria;
import br.org.fundatec.ti11app.viagem.ViagemService;

public class Configuracao {
	public static InterfaceDoUsuario getUI() {
		return new InterfaceDoUsuario(configMotoristaService(), configPassageiroService(), configViagemService());
	}

	private static ViagemService configViagemService() {
		return new ViagemService(new ViagemDaoNaMemoria());
	}

	private static PassageiroService configPassageiroService() {
		return new PassageiroService(new PassageiroDaoNaMemoria(), new CalculadoraValoresImpl());
	}

	private static MotoristaService configMotoristaService() {
		return new MotoristaService(new MotoristaDaoNaMemoria(), new CalculadoraValoresImpl());
	}
}
