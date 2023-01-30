package br.com.locadora.service;

import java.util.List;

import br.com.locadora.interfaces.*;
import br.com.locadora.models.Cliente;
import br.com.locadora.models.Funcionario;

public abstract class Aluguel {
    private List<? extends Cliente> listaClientes;

    public Aluguel(List<? extends Cliente> listaClientes) {
        setListaClientes(listaClientes);   
    }

    public abstract void alugar(Funcionario funcionario, Cliente cliente, int idProduto);

    public List<? extends ICliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<? extends Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
