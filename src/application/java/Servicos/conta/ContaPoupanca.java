package Servicos.conta;

import banco.Banco;
import banco.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Integer id, Cliente cliente, Banco banco) {
        super(id, cliente,banco);
    }
}
