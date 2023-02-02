package Servicos.Cartao;

import Pessoas.Pessoa;
import Servicos.Servico;
import banco.Cliente;

import java.time.LocalDate;

public class Cartao implements Servico {
    private final Integer numero;
    private final Integer cvv;
    private final Integer senha;
    private final Integer limite;

    private BandeiraCard bandeira;

    private final Cliente cliente;


    public Cartao(Integer numero, Integer cvv, Integer senha, Integer limite, Cliente cliente) {
        this.numero = numero;
        this.cvv = cvv;
        this.senha = senha;
        this.limite = limite;
        this.cliente = cliente;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCvv() {
        return cvv;
    }

    public Integer getLimite() {
        return limite;
    }

    public BandeiraCard getBandeira() {
        return bandeira;
    }

    public void setBandeira(BandeiraCard bandeira) {
        this.bandeira = bandeira;
    }

    public void comprar(Double valor){
        if(valor <= this.limite){
            System.out.println("Compra realizada com sucesso!");
        }else{
            System.out.println("Compra não realizada, limite insuficiente!");
        }
    }

    @Override
    public LocalDate getDataInicio() {
        return null;
    }

    @Override
    public Pessoa getTitular() {
        return this.cliente;
    }
}
