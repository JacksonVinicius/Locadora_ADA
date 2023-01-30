package br.com.locadora.models;

import br.com.locadora.interfaces.IFuncionario;

public class Funcionario extends Pessoa implements IFuncionario {

    private String matricula;

    public Funcionario(String nome, String cpf, String endereco, String dataDeNascimento, String matricula) {
        super(nome, cpf, endereco, dataDeNascimento);
        setMatricula(matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
}
