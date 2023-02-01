import Pessoas.Pessoa;
import banco.Cliente;
import org.hamcrest.core.IsInstanceOf;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PessoasTest {

    @Test
    void criaCliente() {
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", 1);
        assertEquals(cliente.getNome(), "João");
    }

    @Test
    void clienteEpessoa() {
        Cliente cliente = new Cliente("João", "123456789", "2002-12-03", "passsagem nazaré", 1);
        boolean check = cliente instanceof Pessoa;
        assertEquals(check, true);
    }
}
