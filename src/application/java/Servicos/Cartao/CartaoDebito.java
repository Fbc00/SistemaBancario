package Servicos.Cartao;

import Servicos.conta.Conta;
import banco.Cliente;

public class CartaoDebito extends Cartao{
    private Conta conta;
    public CartaoDebito(Integer numero, Integer cvv, Integer senha, Integer limite, Conta conta, Cliente cliente) {
        super(numero, cvv, senha, limite, cliente);
        this.setBandeira(BandeiraCard.MASTERCARD);
        this.conta = conta;
        this.checkTItular(cliente);
    }

    @Override
    public void comprar(Double valor){
        this.conta.sacar(valor);
    }


    public void checkTItular(Cliente cliente){
        if(!cliente.equals(this.conta.getTitular())){
            throw new RuntimeException("Cliente não é o titular da conta");
        }
    }
}
