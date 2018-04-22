package builder;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    public static class PessoaBuilder {

        private String nome;
        private LocalDate dataNascimento;
        private Endereco endereco;

        public PessoaBuilder comNome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder comDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public PessoaBuilder comEndereco(String rua) {
            this.endereco = new Endereco(rua);
            return this;
        }

        public Pessoa construir() {
            if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
                throw new DataNascimentoInvalidaException();
            }
            if (nome == null || nome.length() < 2) {
                throw new NomeInvalidoException();
            }
            return new Pessoa(nome, dataNascimento, endereco);
        }
    }
}
