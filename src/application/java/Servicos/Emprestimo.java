package Servicos;

import Pessoas.Pessoa;
import banco.Banco;
import banco.Cliente;

import java.time.LocalDate;

public class Emprestimo implements  Servico{
    private final Cliente cliente;

    private Double valor = 0.0;

    private  Integer parcelas = 0;

    private Double juros = 0.0;

    private final LocalDate dataInicio;

    private Banco banco;

    public Emprestimo(Cliente cliente, Double valor, Banco banco) {
        this.cliente = cliente;
        this.valor = valor;
        this.dataInicio = LocalDate.now();
        this.banco = banco;
    }


    @Override
    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    @Override
    public Pessoa getTitular() {
        return this.cliente;
    }
}
