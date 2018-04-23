package builder;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class PessoaTest {

	@Test(expected = DataNascimentoInvalidaException.class)
	public void naoDeveCriarPessoaComDataNacimentoMaiorQueAgora() {
		Pessoa.builder().comNome("Evanilson").comDataNascimento(LocalDate.MAX).construir();

	}

	@Test(expected = NomeInvalidoException.class)
	public void naoDeveCriarPessoaComNomeEmBranco() {
		Pessoa.builder().comNome("").comDataNascimento(LocalDate.MIN).construir();
	}

	@Test
	public void deveCriarPessoaCorretamente() throws PessoaInvalidaException {
		Pessoa jao = Pessoa.builder().comNome("Joao").comDataNascimento(LocalDate.of(2000, 1, 1))
				.comEndereco("Ipiranga").construir();

		assertEquals("Joao", jao.getNome());
		assertEquals(LocalDate.of(2000, 1, 1), jao.getDataNascimento());
		assertEquals(Endereco.class.getName(), jao.getEndereco().getClass().getName());
		assertEquals("Ipiranga", jao.getEndereco().getRua());
	}
}
