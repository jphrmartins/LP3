package br.org.fundatec.ti11app.viagem;

public class ViagemService {
	private ViagemDao viagemDao;

	public ViagemService(ViagemDao viagemDao) {
		this.viagemDao = viagemDao;
	}
	
	public Viagem buscarViagemPassageiroPorNome(String nomePassageiro) {
		return viagemDao.pegaViagemPeloNomePassageiro(nomePassageiro).get();
	}
	
	public void adicionaViagem(Viagem viagem) {
		viagemDao.adiciona(viagem);
	}
}
