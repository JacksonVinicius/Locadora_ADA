package br.com.locadora.interfaces;

public interface IPagamento {
    void gerarCobranca(double valor);
    boolean validarPagamento();
    boolean liberar();
}
