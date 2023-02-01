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
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", banco.generateId());
        banco.adicionaCliente(cliente);
        assertEquals(banco.getCliente(cliente.getId()), cliente);
    }

    @Test
    void naoAdicionaClienteCadastrado() {
        Banco banco = new Banco(1, "Banco do Brasil");
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", banco.generateId());
        banco.adicionaCliente(cliente);
        Cliente cliente2 = new Cliente("Pedro", "123456789", "1999-12-03", "ufpa varzea", banco.generateId());
        assertThrows(RuntimeException.class, () -> banco.adicionaCliente(cliente2));
    }


}
