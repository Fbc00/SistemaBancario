package Servicos;

import Pessoas.Pessoa;
import banco.Banco;

import java.time.LocalDate;

public interface Servico {


    public LocalDate getDataInicio();

    public  Pessoa getTitular();
}
