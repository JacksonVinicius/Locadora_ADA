package br.com.locadora.service;

import br.com.locadora.interfaces.IPagamento;

public abstract class Pagamento implements IPagamento {

    @Override
    public void gerarCobranca(double valor) {
        System.out.print("Gerando combrança ");
    }

    @Override
    public boolean liberar() {
        return true;
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando pagamento...");
        return true;
    }
    
}
