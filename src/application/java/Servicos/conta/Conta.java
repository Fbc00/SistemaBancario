package Servicos.conta;
import  Servicos.Servico;
import Pessoas.Pessoa;
import banco.Banco;
import banco.Cliente;

import java.time.LocalDate;

public class Conta implements Servico {
    private final Integer id;
    private final Cliente cliente;
    private Double saldo = 0.0;
    private final LocalDate dataInicio;

    private Banco banco;


    public Conta(Integer id, Cliente cliente, Banco banco) {
        this.id = id;
        this.cliente = cliente;
        this.dataInicio = LocalDate.now();
        this.banco = banco;

        banco.adicionaCliente(cliente);

    }

    public Integer getId() {
        return id;
    }


    public Double getSaldo() {
        return saldo;
    }

    protected void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    @Override
    public Pessoa getTitular() {
        return this.cliente;
    }


    public void depositar(Double valor) {
        this.saldo += valor;
    }

    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public void transferir(Double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
    }
}
