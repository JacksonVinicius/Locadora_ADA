package br.com.locadora.models;

public class ClienteVeiculo extends Cliente {
    private String numeroDaHabilitacao;

    public ClienteVeiculo(String nome, String cpf, String endereco, String dataDeNascimento, String numeroDaHabilitacao) {
        super(nome, cpf, endereco, dataDeNascimento);
        setnumeroDaHabilitacao(numeroDaHabilitacao);
    }


    public void setnumeroDaHabilitacao(String numeroDaHabilitacao) {
        this.numeroDaHabilitacao = numeroDaHabilitacao;
    }
    public String getnumeroDaHabilitacao() {
        return numeroDaHabilitacao;
    }
    
    @Override
    public String toString() {
        return "---------------- ClienteVeiculo ---------------\n" +
               "[nome: " + getNome() + ", CPF: " + getCpf() + ", Endereço: " + 
               getEndereco() + ", Data de Nascimento: " + getDataDeNascimento() + 
               ", numero da habilitação: " + getnumeroDaHabilitacao() + "]";
    }
}
