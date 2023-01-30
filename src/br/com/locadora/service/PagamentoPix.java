package br.com.locadora.service;

public class PagamentoPix extends Pagamento {
    @Override
    public void gerarCobranca(double valor) {
        super.gerarCobranca(valor);
        System.out.println("PIX no valor de $" + valor);
    }

    @Override
    public boolean validarPagamento() {
        if(super.validarPagamento()) {
            System.out.println("Pagamento realizado!");
            return true;
        }

        System.out.println("Pagamento não realizado. Combrança espirada, tente novamente.");
        return false;
    }

    @Override
    public boolean liberar() {
        if(super.liberar() && validarPagamento()) {
            System.out.println("Pagamento recebido!");
            return true;
        }

        System.out.println("Pagamento não recebido. Consulte o seu banco e tente novamente.");
        return false;
    }
}
