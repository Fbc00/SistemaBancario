package banco;

import Pessoas.Pessoa;

public class Cliente extends Pessoa {
    private final Integer id;
    private String endereco;

    public Cliente(String nome, String cpf, String dataNascimento, String endereco, Integer id) {
        super(nome, cpf, dataNascimento);
        this.endereco = endereco;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


}
