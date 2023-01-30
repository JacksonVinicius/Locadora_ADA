package br.com.locadora.veiculos;

import br.com.locadora.enums.Cambio;
import br.com.locadora.enums.CarroCarroceria;
import br.com.locadora.enums.Combustivel;

public class Carro extends Veiculo {
    private Cambio cambio;
    private Combustivel combustivel;
    private String cor;
    private CarroCarroceria carroceria;
    
    public Carro(String placa, String marca, String modelo, Cambio cambio, Combustivel combustivel,
                 String cor, CarroCarroceria carroceria, int anoFabricacao, double preco) {

        super(placa, marca, modelo, anoFabricacao, preco);
        
        setCambio(cambio);
        setCombustivel(combustivel);
        setCor(cor);
        setCarroceria(carroceria);
    }
    
    public Cambio getCambio() {
        return cambio;
    }
    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }
    public Combustivel getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public CarroCarroceria getCarroceria() {
        return carroceria;
    }
    public void setCarroceria(CarroCarroceria carroceria) {
        this.carroceria = carroceria;
    }
}
