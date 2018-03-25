package br.org.fundatec.ti11app;

import java.time.LocalDate;
import java.util.Scanner;

import br.org.fundatec.ti11app.motorista.Motorista;
import br.org.fundatec.ti11app.motorista.MotoristaService;
import br.org.fundatec.ti11app.passageiro.Passageiro;
import br.org.fundatec.ti11app.passageiro.PassageiroService;
import br.org.fundatec.ti11app.viagem.Viagem;
import br.org.fundatec.ti11app.viagem.ViagemService;

public class InterfaceDoUsuario {

	private MotoristaService motoristaService;
	private PassageiroService passageiroService;
	private ViagemService viagemService;
	private Scanner scanner;

	

	public InterfaceDoUsuario(MotoristaService motoristaService, PassageiroService passageiroService,
			ViagemService viagemService) {
		this.motoristaService = motoristaService;
		this.passageiroService = passageiroService;
		this.viagemService = viagemService;
		this.scanner = new Scanner(System.in);
	}

	public void iniciar() {
		boolean sair = true;

		while (sair) {
			System.out.println("Bem vindo!");
			System.out.println("Digite o número para escolher a opção desejada");
			System.out.println("1 - adicionar passageiro");
			System.out.println("2 - adicionar motorista");
			System.out.println("3 - adicionar viagem");
			System.out.println("4 - calcular valor devido de um passageiro");
			System.out.println("5 - calcular valor que o motorista deve recebe");
			String escolha = scanner.next();
			boolean entrou = selecionaOpcao(escolha);
			sair = verificaSaida(sair, entrou);
		}
	}

	private boolean selecionaOpcao(String escolha) {
		switch (escolha) {
		case "1":
			adicionarPassageiro();
			return true;
		case "2":
			adicionarMotorista();
			return true;
		case "3":
			adicionarViagem();
			return true;
		case "4":
			calcularValorDevidoDoPassageiro();
			return true;
		case "5":
			calcularValorAReceberMotorista();
			return true;
		default:
			System.out.println("opção não encontrada!");
			return false;
		}
	}

	private boolean verificaSaida(boolean sair, boolean entrou) {
		if (!entrou) {
			sair = true;
		}
		return sair;
	}

	private void adicionarPassageiro() {
		System.out.println("Informe o nome do passageiro");
		passageiroService.adicionar(new Passageiro(scanner.next()));
	}

	private void adicionarMotorista() {
		System.out.println("Digite o nome do motorista:");
		String nome = scanner.next();
		motoristaService.adicionar(new Motorista(nome));
	}

	private void adicionarViagem() {
		System.out.println("Digite o nome do passageiro!");
		Passageiro passageiro = passageiroService.buscarPassageiroPeloNome(scanner.next());

		System.out.println("Digite o nome do motorista!");
		Motorista motorista = motoristaService.buscarMotoristaPorNome(scanner.next());

		System.out.println("Digite a quantidade de km rodados!");
		double kmRodados = scanner.nextDouble();

		System.out.println("Digite a quantidade de minutos!");
		int qtdMinutos = scanner.nextInt();

		System.out.println("DIGITE A DATA!");
		LocalDate dataViagem = formatDate(scanner.next());
		Viagem viagem = new Viagem(passageiro, kmRodados, qtdMinutos, dataViagem);
		viagemService.adicionaViagem(viagem);
		motorista.getViagens().add(viagem);
		System.out.println("viagem adicionada");

	}

	private void calcularValorDevidoDoPassageiro() {
		System.out.println("Informe o nome do passageiro");
		String nomePassageiro = scanner.next();
		Viagem viagem = viagemService.buscarViagemPassageiroPorNome(nomePassageiro);
		double resultado = passageiroService.calcularValorDevidoPeloPassageiro(viagem);
		System.out.println("O passageiro " + nomePassageiro + " Deve: " + resultado);
	}

	private void calcularValorAReceberMotorista() {
		System.out.println("Informe o nome do motorista:");
		String nomeMotorista = scanner.next();
		System.out.println("Informe a data inicio:");
		String dataInicio = scanner.next();
		System.out.println("Informe a data de fim");
		String datafim = scanner.next();

		LocalDate inicio = formatDate(dataInicio);
		LocalDate fim = formatDate(datafim);
		System.out.println(inicio + " " + fim);
		double result = motoristaService.calcularValorAReceber(nomeMotorista, inicio, fim);
		System.out.println("calcular valor que o motorista deve recebe: " + result);
	}

	private LocalDate formatDate(String dataText) {
		return LocalDate.parse(dataText);
	}
}