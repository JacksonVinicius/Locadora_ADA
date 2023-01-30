package br.com.locadora.veiculos;

import br.com.locadora.interfaces.IAluguel;
import br.com.locadora.interfaces.ICrud;

public abstract class Veiculo implements ICrud, IAluguel {
    private int id;
    private boolean disponibilidade;
    private double preco;
    private String placa; //serial
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Veiculo(String placa, String marca, String modelo, int anoFabricacao, double preco) {
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAnoFabricacao(anoFabricacao);
        setPreco(preco);

        this.disponibilidade = true;
        this.id = placa.hashCode();
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public boolean estaDisponivel() {
        return disponibilidade;
    }

    public void trocaDisponibilidade() {
        disponibilidade = !disponibilidade;
    }
}
