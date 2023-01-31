import banco.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import banco.Banco;

public class BancoTest {
    @Test
    void criaBanco() {
        Banco banco = new Banco(1, "Banco do Brasil");
        assertEquals(banco.getId(), 1);
        assertEquals(banco.getNome(), "Banco do Brasil");
    }

    @Test
    void adicionaCliente() {
        Banco banco = new Banco(1, "Banco do Brasil");
        Cliente cliente = new Cliente(1, "João", "123.456.789-00");
        banco.adicionaCliente(cliente);
        assertEquals(banco.getCliente(1), cliente);

    }

    @Test
    void naoAdicionaClienteCadastrado() {
        Banco banco = new Banco(1, "Banco do Brasil");
        Cliente cliente = new Cliente(1, "João", "123.456.789-00");
        banco.adicionaCliente(cliente);
        Cliente cliente2 = new Cliente(1, "João", "123.456.789-00");
        assertThrows(RuntimeException.class, () -> banco.adicionaCliente(cliente2));
    }


}
