package br.com.locadora.service;

import java.util.List;

import br.com.locadora.crud.Crud;
import br.com.locadora.models.Cliente;
import br.com.locadora.models.Funcionario;
import br.com.locadora.veiculos.Veiculo;

public class AluguelVeiculo<T extends Veiculo> extends Aluguel {
    
    private List<T> listaVeiculos;
    
    public AluguelVeiculo(List<Cliente> listaClientes, List<T> listaCarros) {
        super(listaClientes);
        setListaVeiculos(listaCarros);
    }

    @Override
    public void alugar(Funcionario funcionario, Cliente cliente, int idProduto) {
        Crud crud = new Crud();
        T veiculo;

        veiculo = crud.ler(idProduto, listaVeiculos);

        if(veiculo.estaDisponivel()) {
            veiculo.trocaDisponibilidade();
            crud.atualizar(veiculo, listaVeiculos);
        } else {
            System.out.println("Veiculo não disponível");
        }
    }

    public void setListaVeiculos(List<T> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }
    
}
