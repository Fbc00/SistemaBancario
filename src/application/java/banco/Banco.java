package banco;

import Servicos.Servico;

import java.util.HashMap;
import java.util.List;

public class Banco {
    private Integer id;
    private String nome;
    private HashMap<Integer, Cliente> clientes = new HashMap<>();


    private final List<String> servicos = List.of("Conta", "ContaPoupanca", "ContaCorrente", "CartaoCredito", "emprestimo");


    public Banco(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaCliente(Cliente cliente) {
           if (this.getCliente(cliente.getCpf()) != null) {
               throw new RuntimeException("Cliente já cadastrado");
           }
            clientes.put(cliente.getId(), cliente);
    }

    public Cliente getCliente(Integer id) {
        return clientes.get(id);
    }

    public  Cliente getCliente(String cpf) {
        for (Cliente cliente : clientes.values()) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public int generateId() {
        int min = 100000;
        int max = 999999;

        int id = (int) (Math.random() * (max - min + 1) + min);

        if (clientes.containsKey(id)) {
            return generateId();
        }
        return id;
    }


    public List ListServicos() {
        return this.servicos;
    }

}
