package Servicos.Cartao;

import banco.Cliente;

public class CartaoCredito extends Cartao{
    public CartaoCredito(Integer numero, Integer cvv, Integer senha, Integer limite, Cliente cliente) {
        super(numero, cvv, senha, limite, cliente);
        this.setBandeira(BandeiraCard.VISA);
    }
}
