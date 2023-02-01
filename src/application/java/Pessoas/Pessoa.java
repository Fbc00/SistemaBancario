package Pessoas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;

    public Pessoa(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}

