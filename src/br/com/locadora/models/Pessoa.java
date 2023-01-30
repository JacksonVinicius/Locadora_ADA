package br.com.locadora.models;

import br.com.locadora.interfaces.ICrud;

public abstract class Pessoa implements ICrud {
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String dataDeNascimento;
    
    public Pessoa(String nome, String cpf, String endereco, String dataDeNascimento) {
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
        setDataDeNascimento(dataDeNascimento);
        this.id = cpf.hashCode();
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public int getId() {
        return id;
    }
}
