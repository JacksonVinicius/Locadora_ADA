package br.com.locadora.models;

import br.com.locadora.interfaces.ICliente;

public class Cliente extends Pessoa implements ICliente {

    public Cliente(String nome, String cpf, String endereco, String dataDeNascimento) {
        super(nome, cpf, endereco, dataDeNascimento);
    }

    @Override
    public String toString() {
        return "---------------- Cliente ---------------\n" +
               "[nome: " + getNome() + ", CPF: " + getCpf() + ", Endereço: " + 
               getEndereco() + ", Data de Nascimento: " + getDataDeNascimento() + "]";
    }
}
