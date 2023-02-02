package Servicos.conta;

import banco.Banco;
import banco.Cliente;

public class ContaCorrente extends Conta {
    private Double LimitechequeEspecial;

    public ContaCorrente(Integer id, Cliente cliente, Banco banco) {
        super(id, cliente, banco);
        this.LimitechequeEspecial = 200.0;
    }

    @Override
    public void sacar(Double valor) {
        if (valor > this.getSaldo() + this.LimitechequeEspecial) {
            throw new RuntimeException("Saldo insuficiente");
        }
        this.setSaldo(getSaldo() - valor);
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        if (valor > this.getSaldo() + this.LimitechequeEspecial) {
            throw new RuntimeException("Saldo insuficiente");
        }
        this.setSaldo(getSaldo() - valor);
        contaDestino.depositar(valor);
    }
}
