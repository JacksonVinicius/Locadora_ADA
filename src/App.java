import java.util.ArrayList;
import java.util.List;

import br.com.locadora.crud.Crud;
import br.com.locadora.enums.Cambio;
import br.com.locadora.enums.CarroCarroceria;
import br.com.locadora.enums.Combustivel;
import br.com.locadora.models.Cliente;
import br.com.locadora.models.ClienteVeiculo;
import br.com.locadora.models.Funcionario;
import br.com.locadora.service.Aluguel;
import br.com.locadora.service.AluguelVeiculo;
import br.com.locadora.veiculos.Carro;

public class App {
    static List<Cliente> listaClientes = new ArrayList<>();
    static List<Carro> listaCarros = new ArrayList<>();
    static List<Funcionario> listaFuncionarios = new ArrayList<>();
    public static void main(String[] args) {

        Crud crud = new Crud();
        Funcionario funcionario = new Funcionario("Joseph", "78978978900", "EUA", "24/03/1911", "f75910707");
        Cliente cliente = new ClienteVeiculo("Dick Vigarista", "12312312300", "EUA", "14/09/1968", "123123123123");

        crud.inserir(cliente, listaClientes);
        crud.inserir(new Carro("abc123", "hanns-barbera", "Máquina do mal", Cambio.MANUAL, Combustivel.GASOLINA, "Roxo", CarroCarroceria.CUPE, 1968, 10000d), listaCarros);
        crud.inserir(funcionario, listaFuncionarios);

        Aluguel aluguel = new AluguelVeiculo<Carro>(listaClientes, listaCarros);

        aluguel.alugar(funcionario, cliente, new String("abc123").hashCode());

        System.out.println(listaCarros.get(0).estaDisponivel());

    }
}

/*
        Veiculo{
        status
        placa
        km
        modelo
        marca
        anoFabricacao
        categoria
        numeroPortas
        numeroLugares
        Lista<Acessorios>
        tipoCambio
        tipoMotor
        
        _______________________________
        
   
        
        }
     */

    /*
    Locadora
    Veiculos -> Caminhao, Carros, Motos
    Categorias -> Luxo, Economico, etc..
    CRUD -> VEICULOS, CLIENTE, FUNCIONARIO, Acessorios
    Contrato de locacao
    Controle de pagamento (tipo de pagamentos -> Cartao de credito(visa,master,AMEX), debito, 
    cheque, boleto, dinheiro, pix, bitcoin)
    
    
    pagamentoVISA(double valor){
    syout"enviando dados para VISA" + cartao)
    sout(pagamento aceito  + valor)"
     */