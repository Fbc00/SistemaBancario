package banco;

import java.util.HashMap;

public class Banco {
    private Integer id;
    private String nome;
    private HashMap<Integer, Cliente> clientes = new HashMap<>();

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
        if(clientes.containsKey(cliente.getId())) {
            throw new RuntimeException("Cliente já cadastrado");
        }
        clientes.put(cliente.getId(), cliente);
    }

    public Cliente getCliente(Integer id) {
        return clientes.get(id);
    }


}
